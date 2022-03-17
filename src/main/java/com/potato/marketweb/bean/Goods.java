package com.potato.marketweb.bean;

public class Goods {
    private int goodId;
    private String goodsName;
    private int typeId;
    private int sallTypeId;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getSallTypeId() {
        return sallTypeId;
    }

    public void setSallTypeId(int sallTypeId) {
        this.sallTypeId = sallTypeId;
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
}
