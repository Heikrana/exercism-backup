public class LogLevels {
    
    public static String message(String logLine) {
        String msg = logLine.substring(logLine.indexOf("]:") + 2);
        return msg.trim();
    }

    public static String logLevel(String logLine) {
        String lvl = logLine.substring(1, logLine.indexOf("]:"));
        return lvl.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
