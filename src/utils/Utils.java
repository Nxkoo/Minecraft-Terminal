package utils;

import java.io.File;
import java.util.Locale;

public class Utils {
    public String getOS() {
        String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
        if (OS.indexOf("mac") >= 0 || OS.indexOf("darwin") >= 0) {
            return "Mac";
        }
        if (OS.indexOf("win") >= 0) {
            return "Windows";
        }
        if (OS.indexOf("nux") >= 0) {
            return "Linux";
        }
        return "Linux";
    }

    public String getMinecraftFolder() {
        String os = getOS();

        if (os.equals("Windows")) {
            return System.getenv("APPDATA") + File.separator + ".minecraft";
        }
        if (os.equals("Mac")) {
            return System.getProperty("user.home") + File.separator + "Library" + File.separator +"Application Support/minecraft";
        }
        if (os.equals("Linux")) {
            return System.getProperty("user.home") + File.separator + ".minecraft";
        }
        return "N/A";
    }
}
