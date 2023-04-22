package pattern.creation.singelton;

public class SingletonTestCase {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            Database database = Database.MYSQL;
            System.out.println("Thread 1: " + singleton + " connected to " + database.getDescription());
        });

        Thread t2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            Database database = Database.POSTGRESQL;
            System.out.println("Thread 2: " + singleton + " connected to " + database.getDescription());
        });

        Thread t3 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            Database database = Database.ORACLE;
            System.out.println("Thread 3: " + singleton + " connected to " + database.getDescription());
        });

        t1.start();
        t2.start();
        t3.start();
    }
}