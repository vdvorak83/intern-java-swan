package pattern.creation.singelton;

public class SingletonTestCase {
    public static void main(String[] args) {
        // Get singleton instances for each database type
        Singleton mysqlSingleton = Singleton.getInstance(Database.MYSQL);
        Singleton postgresSingleton = Singleton.getInstance(Database.POSTGRES);
        Singleton oracleSingleton = Singleton.getInstance(Database.ORACLE);

        // Print the database type for each singleton instance
        System.out.println("MySQL database: " + mysqlSingleton.getDatabase().getType());
        System.out.println("PostgreSQL database: " + postgresSingleton.getDatabase().getType());
        System.out.println("Oracle database: " + oracleSingleton.getDatabase().getType());

        // Try to create a singleton instance with a null value
        try {
            Singleton nullSingleton = Singleton.getInstance(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try to create a second singleton instance with a different value
        Singleton secondMysqlSingleton = Singleton.getInstance(Database.MYSQL);
        System.out.println("Second MySQL database: " + secondMysqlSingleton.getDatabase().getType());
    }
}