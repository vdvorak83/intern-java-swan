package pattern.creation.singelton;

public class Singleton {
    private static Singleton instance;
    private final Database database;

    private Singleton(Database database) {
        if (database == null) {
            throw new IllegalArgumentException("Database cannot be null");
        }
        this.database = database;
    }

    public static Singleton getInstance(Database database) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(database);
                }
            }
        }
        return instance;
    }

    public Database getDatabase() {
        return database;
    }
}
