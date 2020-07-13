package com.example.myapplication2;

public class Product {
    private  String productName;
    private  long code;

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    private String imageProduct;

    public String getProductName() { return productName; }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public long getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(long expiredDate) {
        this.expiredDate = expiredDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private  long expiredDate;
    private  double price;

}
