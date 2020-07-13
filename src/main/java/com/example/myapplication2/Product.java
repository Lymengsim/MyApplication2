package com.example.myapplication2;

public class Product {
    private  String productName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private  String code;

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
