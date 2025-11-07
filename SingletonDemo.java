
import java.time.LocalDateTime;

class Logger {
    private static Logger instance = new Logger();
    // Private static instance 

    
    private Logger() {}// Private constructor 

    public static Logger getInstance() {
        return instance;
    }// Public method to return the same instance

    
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " : " + message);
    }// Method to log messages with a timestamp
}

public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Still the same Logger instance!");

        // Verify both instances are the same
        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
