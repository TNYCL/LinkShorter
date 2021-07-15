package shorter.util;

public class UtilLog {

	public static void info(Object msg) {
		System.out.println("[INFO] " + msg);
	}
	
	public static void warning(Object msg) {
		System.out.println("[WARNING] " + msg);
	}
	
	public static void success(Object msg) {
		System.out.println("[SUCCESS] " + msg);
	}
	
	public static void error(Object msg, boolean kill) {
		System.out.println("[ERROR] " + msg);
		if(kill) UtilProcess.killRuntime();
	}
	
}
