package edu.scau.mis.lab.entity;

import java.io.Serializable;

/**
 * (LabCategory)实体类
 */

public class LabCategory implements Serializable{
    private static final long serialVersionUID = -37464733255614026L;
    /**
     * 图书类型ID
     */
    private Integer categoryId;
    /**
     * 类型编号
     */
    private String categoryNo;
    /**
     * 类型名称
     */
    private String categoryName;


    public Integer getTypeId() {
        return categoryId;
    }

    public void setTypeId(Integer typeId) {
        this.categoryId = typeId;
    }

    public String getTypeNo() {
        return categoryNo;
    }

    public void setTypeNo(String typeNo) {
        this.categoryNo = typeNo;
    }

    public String getTypeName() {
        return categoryName;
    }

    public void setTypeName(String typeName) {
        this.categoryName = typeName;
    }

}
