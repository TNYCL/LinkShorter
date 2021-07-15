package shorter.util;

public class UtilURL {
	
	public static boolean validateURL(String url) {
		if(url.startsWith("https://") || url.startsWith("http://")) return true;
		return false;
	}

}
