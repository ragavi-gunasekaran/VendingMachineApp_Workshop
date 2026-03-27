package lexicon.workshop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineImplementation implements IVendingMachine {

    final List<Integer> coins = Arrays.asList(1,2,5,10,20,50);
    int balance = 0;

    @Override
    public List<Product> getProducts() {
        List<Product> productList = getProductsList();
        for (Product p : productList){
            System.out.println(p.getDescription());
        }
        return productList;
    }

    public List<Product> getProductsList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Beverages(1,"Orange", 3, 20, "Fanta"));
        productList.add(new Fruits(2,false, 3,10,"Apple"));
        productList.add(new Snacks(3,true, 9,30, "Chips"));
        return productList;
    }

    @Override
    public void insertCoin(int coin) {
            if (coins.contains(coin)) {
                balance += coin;
                System.out.println("Coin Inserted : " + coin);
                System.out.println("Available balance now : " + balance);
            } else {
                System.out.println("Invalid coin: " + coin);
            }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public Product purchaseProduct(int productId) {
        List<Product> list = getProductsList();
        for (Product p : list) {
            if (p.getId() == productId) {
                if (p.getQuantity() == 0) {
                    System.out.println("Out of stock");
                    return null;
                }
                if (balance < p.getPrice()) {
                    System.out.println("Insufficient balance");
                    return null;
                }

                balance -= p.getPrice();
                p.setQuantity(p.getQuantity() - 1);
                return p;
            }
        }
        return null;
    }

    @Override
    public int returnChange() {
        int balanceChange = balance;
        balance = 0;
        return balanceChange;
    }
}
