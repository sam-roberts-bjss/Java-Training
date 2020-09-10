import items.Hammer;
import items.Physical;

public class Main {
    public static void main(String[] args) {
        Hammer hammer = new Hammer();
        hammer.use();
        printMass(hammer);

        System.out.println(hammer.getPhysicalType());
    }

    private static void printMass(Physical thing) {
        System.out.println(thing.getMass());
    }
}
