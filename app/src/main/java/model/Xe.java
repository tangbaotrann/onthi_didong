package model;

public class Xe {

    private int img;
    private String name;
    private String price;
    private String priceBo;

    public Xe(int img, String name, String price, String priceBo) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.priceBo = priceBo;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceBo() {
        return priceBo;
    }

    public void setPriceBo(String priceBo) {
        this.priceBo = priceBo;
    }

}
