package lexicon.workshop;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImplementation extends Product implements IVendingMachine {

    public VendingMachineImplementation(int id, int quantity, int price, String name) {
        super(id, quantity, price, name);
    }

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
        List<Product> productList = new ArrayList<>();
        productList.add(new Beverages(1,"Coke", 20, 1, "Orange"));
        productList.add(new Fruits(2,false, 10,1,"Apple"));
        productList.add(new Snacks(3,true, 30,1, "Chips"));
        return productList;
    }

    @Override
    public String getDescription() {
        return "Product Description : " + getName() + getId() + getPrice() + getQuantity();
    }
}
