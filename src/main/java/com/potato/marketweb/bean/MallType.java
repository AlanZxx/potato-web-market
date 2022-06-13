package com.potato.marketweb.bean;

public class MallType {

    private int mallTypeId;
    private String mallTypeName;
    private int mallCounts;
    private int mallTypeStatus;
    private String createTime;
    private String updateTime;
    private String detail;
    private String createOpId;
    private String updateOpId;
    private int mallTypeLevel;
    private int parentId;

    public int getMallTypeId() {
        return mallTypeId;
    }

    public void setMallTypeId(int mallTypeId) {
        this.mallTypeId = mallTypeId;
    }

    public String getMallTypeName() {
        return mallTypeName;
    }

    public void setMallTypeName(String mallTypeName) {
        this.mallTypeName = mallTypeName;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCreateOpId() {
        return createOpId;
    }

    public void setCreateOpId(String createOpId) {
        this.createOpId = createOpId;
    }

    public String getUpdateOpId() {
        return updateOpId;
    }

    public void setUpdateOpId(String updateOpId) {
        this.updateOpId = updateOpId;
    }

    public int getMallTypeLevel() {
        return mallTypeLevel;
    }

    public void setMallTypeLevel(int mallTypeLevel) {
        this.mallTypeLevel = mallTypeLevel;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "MallType{" +
                "mallTypeId=" + mallTypeId +
                ", mallTypeName='" + mallTypeName + '\'' +
                ", mallCounts=" + mallCounts +
                ", mallTypeStatus=" + mallTypeStatus +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", detail='" + detail + '\'' +
                ", createOpId='" + createOpId + '\'' +
                ", updateOpId='" + updateOpId + '\'' +
                ", mallTypeLevel=" + mallTypeLevel +
                ", parentId=" + parentId +
                '}';
    }
}
