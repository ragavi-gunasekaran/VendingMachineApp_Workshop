package lexicon.workshop;

public class Snacks extends Product {

    private boolean isToppingsNeeded;

    public Snacks(int id, boolean isToppingsNeeded, int quantity, int price, String name) {
        super(id,quantity,price,name);
        this.isToppingsNeeded = isToppingsNeeded;
    }

    @Override
    public String getDescription() {
        return getName() + (isToppingsNeeded ? " with toppings" : "") + " - " + getPrice() + " SEK";

    }

    public boolean isToppingsNeeded() {
        return isToppingsNeeded;
    }

    public void setToppingsNeeded(boolean toppingsNeeded) {
        isToppingsNeeded = toppingsNeeded;
    }

}
