package lexicon.workshop;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImplementation implements IVendingMachine {

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
        productList.add(new Beverages(1,"Orange", 3, 20, "Fanta"));
        productList.add(new Fruits(2,false, 3,10,"Apple"));
        productList.add(new Snacks(3,true, 9,30, "Chips"));
        for (Product p : productList){
            System.out.println(p.getDescription());
        }
        return productList;
    }
}
