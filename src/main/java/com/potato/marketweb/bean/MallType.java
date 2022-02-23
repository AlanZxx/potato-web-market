package com.potato.marketweb.bean;

public class MallType {

    private int typeId;
    private String typeName;
    private int mallCounts;
    private int mallTypeStatus;
    private String detail;
    private String updateTime;
    private String addTime;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getMallCounts() {
        return mallCounts;
    }

    public void setMallCounts(int mallCounts) {
        this.mallCounts = mallCounts;
    }

    public int getMallTypeStatus() {
        return mallTypeStatus;
    }

    public void setMallTypeStatus(int mallTypeStatus) {
        this.mallTypeStatus = mallTypeStatus;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
}
