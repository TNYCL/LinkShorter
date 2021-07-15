package shorter.util;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class UtilString {
	
	public static String generateUUID() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            if(i == 2 || i == 9) {
            	builder.append("-");
            	continue;
            }
        	builder.append(chars.charAt((int) (Math.random() * chars.length())));
        }
        return builder.toString();
    }
	
	public static void clipboardString(String value) {
		StringSelection selection = new StringSelection(value);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
	}

}
