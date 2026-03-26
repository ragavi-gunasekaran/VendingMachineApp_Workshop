package lexicon.workshop;

public class Fruits extends Product {

    private int id;
    private String name;
    private int price;
    private int quantity;
    private boolean isCutFruit;

    public Fruits(int id, boolean isJuice, int quantity, int price, String name) {
        super(id,quantity,price,name);
        this.isCutFruit = isJuice;
    }

    @Override
    public String getDescription() {
        return "";
    }

    public boolean isCutFruit() {
        return isCutFruit;
    }

    public void SetCutFruit(boolean cutFruit) {
        isCutFruit = cutFruit;
    }
}
