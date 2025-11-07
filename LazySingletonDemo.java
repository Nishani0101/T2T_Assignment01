
class LazyLogger {
    private static volatile LazyLogger instance;

    private LazyLogger() {}

    // Double-checked locking for thread safety
    public static LazyLogger getInstance() {
        if (instance == null) {
            synchronized (LazyLogger.class) {
                if (instance == null) {
                    instance = new LazyLogger();
                }
            }
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}

public class LazySingletonDemo {
    public static void main(String[] args) {
        LazyLogger logger1 = LazyLogger.getInstance();
        LazyLogger logger2 = LazyLogger.getInstance();

        logger1.log("First log entry.");
        logger2.log("Same instance again!");

        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
