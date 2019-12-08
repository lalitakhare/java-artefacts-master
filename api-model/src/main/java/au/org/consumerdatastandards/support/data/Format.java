package au.org.consumerdatastandards.support.data;

public enum Format {

    DATE ("date"),
    DATE_TIME("date-time"),
    URI("uri");

    String name;

    Format(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
