package items;

public abstract class Item implements Physical {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract void use();
    public abstract PhysicalType getPhysicalType();

    public String getName() {
        return name;
    }
}
