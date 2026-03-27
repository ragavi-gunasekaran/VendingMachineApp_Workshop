package lexicon.workshop;

public class Fruits extends Product {

    private boolean isCutFruit;

    public Fruits(int id, int quantity, int price, String name,boolean isJuice) {
        super(id,quantity,price,name);
        this.isCutFruit = isJuice;
    }

    @Override
    public String getDescription() {
        return "Product ID : " + getId() + " === " +
                getName() + (isCutFruit ? " (Cut)" : " (Whole)") + " - " + getPrice() + " SEK";
    }

    public boolean isCutFruit() {
        return isCutFruit;
    }

    public void SetCutFruit(boolean cutFruit) {
        isCutFruit = cutFruit;
    }
}
