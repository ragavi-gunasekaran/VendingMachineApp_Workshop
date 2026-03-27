package lexicon.workshop;

public class Beverages extends Product {

    private String flavour;

    public Beverages(int id, int quantity, int price, String name, String flavour) {
        super(id,quantity,price,name);
        this.flavour = flavour;
    }

    @Override
    public String getDescription() {
        return "Product ID : " + getId() + " === " +
                getName() + " (" + flavour + ") - " + getPrice() + " SEK";
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
