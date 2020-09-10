package items;

public enum PhysicalType {
    ITEM("Item"),
    PERSON("Person"),
    ROOM("Room"),
    HAMMER("Hammer");

    private final String name;

    PhysicalType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
