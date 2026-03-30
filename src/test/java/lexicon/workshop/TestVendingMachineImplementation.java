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
    void testPurchaseFailsOutOfStock() {
        Product product = vendingMachine.getProducts().get(0);
        product.setQuantity(0);
        vendingMachine.insertCoin(50); // sufficient balance
        Product result = vendingMachine.purchaseProduct(product.getId());
        assertNull(result); // purchase fails
        assertEquals(50, vendingMachine.getBalance()); // balance unchanged
        assertEquals(0, product.getQuantity()); // still 0
    }

    @Test
    void testGetProductsReturnsAllItems() {
        List<Product> products = vendingMachine.getProducts();
        assertEquals(3, products.size());
    }
}
