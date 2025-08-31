package withSimpleFactoryImpl;

public class BeefBurger implements Burger {
    private int productId;
    private boolean angus;
    private String addOns;

    public String prepare() {
        return "Your BeefBurger is ready";
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public boolean isAngus() {
        return angus;
    }

    public void setAngus(boolean angus) {
        this.angus = angus;
    }

    public String getAddOns() {
        return addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }
}
