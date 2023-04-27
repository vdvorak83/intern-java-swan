package pattern.creation.singelton;

public final class Singleton {
    private static Singleton instance;
    private static  Database  lock = Database.MYSQL;

    private Singleton() {
    }

    public static Singleton getInstance(Database database) {
        if (instance == null) {
            synchronized (lock) {
                lock = database;
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static Database getLock(){
        return lock;
    }
}
