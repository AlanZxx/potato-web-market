package com.potato.marketweb.bean;

public class SaleType {
    private int saleTypeId;
    private String saleTypeName;
    private int goodsCount;
    private String detail;
    private String addTime;
    private String updateTime;

    public int getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(int saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    public String getSaleTypeName() {
        return saleTypeName;
    }

    public void setSaleTypeName(String saleTypeName) {
        this.saleTypeName = saleTypeName;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SaleType{" +
                "saleTypeId=" + saleTypeId +
                ", saleTypeName='" + saleTypeName + '\'' +
                ", goodsCount=" + goodsCount +
                ", detail='" + detail + '\'' +
                ", addTime='" + addTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
