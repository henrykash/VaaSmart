package com.example.vaasmart;

public class Products {
    private String mTitle;
    private String mImage;
    private String mPrice;

    public  Products(){}

    public Products(String mTitle, String mImage, String mPrice) {
        this.setTitle(mTitle);
        this.setImage(mImage);
        this.setPrice(mPrice);



    }

    private void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private void setImage(String mImage) {
        this.mImage= mImage;
    }

    private void setPrice(String mPrice) {
        this.mPrice= mPrice;
    }

    public String getTitle() {
        return mTitle;
    }
    public String getmImage() {
        return mImage;
    }
    public String getPrice() {
        return mPrice;
    }
}