//  Main.java
public class Main {
    public static void main(String[] args) {
        // Get Logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("First log message.");
        logger2.log("Second log message.");

        // Verify both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances found. Singleton pattern failed.");
        }
    }
}
