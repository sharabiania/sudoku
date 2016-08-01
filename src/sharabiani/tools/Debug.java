package sharabiani.tools;

/**
 * Created by shara on 2016-08-01.
 */
public class Debug
{
    public static enum LogLevel {Info, Warning, Error};

    public static void log(String message) {
        System.out.println("Info - " + message);
    }

    public static void logWarning(String message) {
        System.out.println("Warning - " + message);
    }

    public static void logError(String message) {
        System.out.println("Error - " + message);
    }

    public static  void logToFile(LogLevel level, String message){
        throw new UnsupportedOperationException("Method not implemented.");
    }
}
