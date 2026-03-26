package lexicon.workshop;

import java.util.List;

public interface IVendingMachine {

    public void insertCoin(int coin);

    public int getBalance();

    public Product purchaseProduct(int productId);

    public int returnChange();

    public List<Product> getProducts();

}
