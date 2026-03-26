package lexicon.workshop;

public abstract class Product {

    private int id;
    private String name;
    private int price;
    private int quantity;

    public Product(int id, int quantity, int price, String name) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public abstract String getDescription();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
