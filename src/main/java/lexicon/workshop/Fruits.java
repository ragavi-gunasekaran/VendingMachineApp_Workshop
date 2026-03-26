package lexicon.workshop;

public class Fruits extends Product {

    private int id;
    private String name;
    private int price;
    private int quantity;
    private boolean isJuice;

    public Fruits(int id, boolean isJuice, int quantity, int price, String name) {
        this.id = id;
        this.isJuice = isJuice;
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

    public boolean isJuice() {
        return isJuice;
    }

    public void setJuice(boolean juice) {
        isJuice = juice;
    }
}
