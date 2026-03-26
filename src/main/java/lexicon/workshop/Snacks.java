package lexicon.workshop;

public class Snacks extends Product {

    private int id;
    private String name;
    private int price;
    private int quantity;
    private boolean isToppingsNeeded;

    public Snacks(int id, boolean isToppingsNeeded, int quantity, int price, String name) {
        this.id = id;
        this.isToppingsNeeded = isToppingsNeeded;
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

    public boolean isToppingsNeeded() {
        return isToppingsNeeded;
    }

    public void setToppingsNeeded(boolean toppingsNeeded) {
        isToppingsNeeded = toppingsNeeded;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
