package lexicon.workshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
