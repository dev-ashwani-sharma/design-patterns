package withSimpleFactoryImpl;

public class VeggieBurger implements Burger {


    private boolean combo;

    private int productId;

    private String addOns;

    @Override
    public String prepare() {
        return "Your VeggieBurger is ready.";
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public boolean isCombo() {
        return combo;
    }

    public void setCombo(boolean combo) {
        this.combo = combo;
    }

    public String getAddOns() {
        return addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }
}
