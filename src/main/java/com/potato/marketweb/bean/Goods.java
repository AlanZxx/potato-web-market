package com.potato.marketweb.bean;

public class Goods {
    private int goodId;
    private String goodName;
    private int typeId;
    private int saleTypeId;
    private int counts;
    private String detail;
    private float price;
    private float priceDis;
    private float discount;


    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(int saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPriceDis() {
        return priceDis;
    }

    public void setPriceDis(float priceDis) {
        this.priceDis = priceDis;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", typeId=" + typeId +
                ", saleTypeId=" + saleTypeId +
                ", counts=" + counts +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", priceDis=" + priceDis +
                ", discount=" + discount +
                '}';
    }
}
