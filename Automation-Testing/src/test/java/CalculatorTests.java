import org.junit.Test;

import org.junit.*;

public class CalculatorTests {
    int expectedValue = 9;

    @Before
    public void setup() {
        expectedValue++;
        System.out.println("Setup");
    }

    @After
    public void tearDown() {
        System.out.println("Tear down");
    }

    @Test
    public void testAdd() {
        System.out.println("Running test add");
        int actual = 1 + 1;
        Assert.assertEquals(expectedValue, actual);
    }

    @Test
    public void testSubtract() {
        System.out.println("Running test subtract");
        int actual = 2 - 1;
        Assert.assertEquals(expectedValue, actual);
    }
}
