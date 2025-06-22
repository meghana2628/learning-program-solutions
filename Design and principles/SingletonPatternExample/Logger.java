// Logger.java
public class Logger {

    // Static variable to hold single instance
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Method to simulate logging
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
