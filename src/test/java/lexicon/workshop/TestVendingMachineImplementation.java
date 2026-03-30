package lexicon.workshop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestVendingMachineImplementation {

    IVendingMachine vendingMachine = new VendingMachineImplementation();

    @Test
    public void testReturnChange(){
        assertEquals(0,vendingMachine.returnChange());
    }

    @Test
    public void testInsertCoin(){
        vendingMachine.insertCoin(10);
       assertEquals(10, vendingMachine.getBalance());
    }

    @Test
    public void testInsertCoinInvalid(){
        vendingMachine.insertCoin(7);
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    void testSuccessfulPurchase() {
        vendingMachine.insertCoin(20);
        Product p = vendingMachine.purchaseProduct(1);
        assertNotNull(p);
        assertEquals(10, vendingMachine.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        vendingMachine.insertCoin(5);
        Product p = vendingMachine.purchaseProduct(1);
        assertNull(p);
        assertEquals(5, vendingMachine.getBalance());
    }

    @Test
    void testGetProductsReturnsAllItems() {
        List<Product> products = vendingMachine.getProducts();
        assertEquals(3, products.size());
    }
}
