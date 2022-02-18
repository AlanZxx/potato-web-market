package com.potato.marketweb.bean;

public class mallType {
    private int typeId;
    private String typeName;
    private int mallCounts;
    private int mallTypeStatus;

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
}
