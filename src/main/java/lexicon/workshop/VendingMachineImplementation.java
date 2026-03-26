package lexicon.workshop;

import java.util.List;

public class VendingMachineImplementation extends Product implements IVendingMachine {

    @Override
    public void insertCoin(int coin) {

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public Product purchaseProduct(int productId) {
        return null;
    }

    @Override
    public int returnChange() {
        return 0;
    }

    @Override
    public List<Product> getProducts() {
        return List.of();
    }

    @Override
    public String getDescription() {
        return "Product Description : " + getName() + getId() + getPrice() + getQuantity();
    }
}
