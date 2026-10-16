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

    @Test
    void testGetStock() {
        assertEquals(5, vendor.getStock("Candy"));
    }

    @Test
    void testSelectGum() {
        vendor.addMoney(10.00);
        int initStock = vendor.getStock("Gum");
        vendor.select("Gum");
        int finStock = vendor.getStock("Gum");
        assertEquals(initStock - 1, finStock);

    }

    @Test
    void testSelectCandy() {
        vendor.addMoney(10.00); // Add money to purchase Candy
        int initStock = vendor.getStock("Candy");
        vendor.select("Candy");
        int finStock = vendor.getStock("Candy");
        assertEquals(initStock - 1, finStock);

    }

    @Test
    void testEmptyInventory() {
        vendor.addMoney(50);
        vendor.select("Candy");
        vendor.select("Candy");
        vendor.select("Candy");
        vendor.select("Candy");
        vendor.select("Candy");
        assertEquals(0, vendor.getStock("Candy"));
    }

    @Test
    void testRestock() {
        int initStock = vendor.getStock("Candy");
        vendor.restock("Candy", 5);
        assertEquals(initStock + 5, vendor.getStock("Candy"));

    }



}