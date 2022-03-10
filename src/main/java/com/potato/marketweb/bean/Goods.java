package com.potato.marketweb.bean;

public class Goods {
    private int goodsId;
    private String goodsName;
    private int typeId;
    private int sallType;
    private int counts;
    private String detail;
    private float price;
    private float priceDis;
    private float discount;

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
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

    public int getSallType() {
        return sallType;
    }

    public void setSallType(int sallType) {
        this.sallType = sallType;
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
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", typeId=" + typeId +
                ", sallType=" + sallType +
                ", counts=" + counts +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", priceDis=" + priceDis +
                ", discount=" + discount +
                '}';
    }
}
