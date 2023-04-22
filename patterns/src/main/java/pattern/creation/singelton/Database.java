package pattern.creation.singelton;

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

