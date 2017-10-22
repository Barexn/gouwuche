package myapplication.gouwuche;

/**
 * Created by Bare on 2017/10/22.
 */

public class ShopBean {
    public String shopName;
    public int price;
    public boolean isSelected;

    public ShopBean(String shopName, int price, boolean isSelected) {
        this.shopName = shopName;
        this.price = price;
        this.isSelected = isSelected;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
