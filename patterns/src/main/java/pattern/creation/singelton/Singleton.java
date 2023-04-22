package pattern.creation.singelton;

public final class Singleton {
    private static Singleton instance;
    private static Object lock = new Object();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
