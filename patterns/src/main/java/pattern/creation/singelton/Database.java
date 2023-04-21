package pattern.creation.singelton;

public enum Database {
    MYSQL("MySQL"),
    POSTGRES("PostgreSQL"),
    ORACLE("Oracle");

    private final String type;

    Database(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

