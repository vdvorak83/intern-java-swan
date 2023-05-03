package pattern.creation.singelton;

public final class Singleton {
    public enum Database {
        MYSQL("MySQL Database"),
        POSTGRESQL("PostgreSQL Database"),
        ORACLE("Oracle Database");

        private String description;

        Database(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

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
