package lexicon.workshop;

public class Beverages extends Product {

    private int id;
    private String name;
    private int price;
    private int quantity;
    private String flavour;

    public Beverages(int id, String flavour, int quantity, int price, String name) {
        this.id = id;
        this.flavour = flavour;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
