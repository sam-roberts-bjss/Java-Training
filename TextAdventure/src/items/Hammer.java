package items;

public class Hammer extends Item {
    public Hammer() {
        super("Hammer");
    }

    @Override
    public void use() {
        System.out.println("Boom!");
    }

    @Override
    public PhysicalType getPhysicalType() {
        return PhysicalType.HAMMER;
    }

    @Override
    public int getMass() {
        return 3;
    }
}
