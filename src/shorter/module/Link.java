package shorter.module;

import java.util.Scanner;

import shorter.Settings;
import shorter.sql.MySQL;
import shorter.util.UtilLog;
import shorter.util.UtilProcess;
import shorter.util.UtilString;
import shorter.util.UtilURL;

public class Link {
	
	private String value;
	
	@SuppressWarnings("resource")
	public Link() {
        Scanner valueScanner = new Scanner(System.in);
        UtilLog.info("Link:");
        
        this.value = valueScanner.nextLine();
        if(!UtilURL.validateURL(value)) {
        	UtilLog.error("Link hatalı, lütfen kontrol edin.", true);
        	return;
        }
        String link = MySQL.getShortLink(value);
        if(link != null) {
        	UtilLog.error("Bu link zaten kısaltılmış: " + Settings.link + link, true);
        	UtilString.clipboardString(Settings.link + link);
        	return;
        }
        String uuid = UtilString.generateUUID();
        MySQL.setShortLink(uuid, this.value);
        UtilLog.success("Link başarıyla kısaltıldı: " + Settings.link + uuid);
        UtilString.clipboardString(Settings.link + uuid);
        UtilProcess.killRuntime();
	}
	
	public String getValue() {
		return this.value;
	}

}
