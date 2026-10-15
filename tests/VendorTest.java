import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendorTest {

    Vending vendor;

    @BeforeEach
    void setUp() {
        this.vendor = new Vending(5, 5); // Creates a fresh vending before each test with 5 candy and 5 gum
    }

    @Test
    void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void test_addMoney() {
        double initBal = vendor.getBalance(); // Gets the initial balance
        vendor.addMoney(10.0); // Adds $10
        assertEquals(initBal + 10, vendor.getBalance()); // Checks that the initial + 10 equals the new balance

    }


}