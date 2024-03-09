package logs;

import utils.Color;

public class Logger {
    
    public static void info(String msg) {
        System.out.printf("%s[INFO] %s%s\n", Color.OKBLUE, msg, Color.ENDC);
    }

    public static void warning(String msg) {
        System.out.printf("%s[WARNING] %s%s\n", Color.WARNING, msg, Color.ENDC);
    }
    public static void error(String msg) {
        System.out.printf("%s[ERROR] %s%s\n", Color.FAIL, msg, Color.ENDC);
    }

    public static void printstrace(Throwable t) {
        throw new RuntimeException(Color.FAIL + "[EXCEPTION]" + Color.ENDC, t);
    }
}
