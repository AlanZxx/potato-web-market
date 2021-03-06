package com.potato.marketweb.bean;

public class Goods {
    private String goodId;
    private String goodName;
    private int mallTypeId;
    private int saleTypeId;
    private int counts;
    private String detail;
    private float price;
    private float priceDis;
    private float discount;
    private String createTime;
    private String updateTime;


    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getMallTypeId() {
        return mallTypeId;
    }

    public void setMallTypeId(int mallTypeId) {
        this.mallTypeId = mallTypeId;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodId='" + goodId + '\'' +
                ", goodName='" + goodName + '\'' +
                ", mallTypeId=" + mallTypeId +
                ", saleTypeId=" + saleTypeId +
                ", counts=" + counts +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", priceDis=" + priceDis +
                ", discount=" + discount +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
