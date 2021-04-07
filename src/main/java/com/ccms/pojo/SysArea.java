package com.ccms.pojo;


public class SysArea {

  private String areaNumber;
  private String name;
  private int type;
  private String parentId;
  private int isLeaf;
  private int sortNumber;
  private int dealState;


  public String getAreaNumber() {
    return areaNumber;
  }

  public void setAreaNumber(String areaNumber) {
    this.areaNumber = areaNumber;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public int getIsLeaf() {
    return isLeaf;
  }

  public void setIsLeaf(int isLeaf) {
    this.isLeaf = isLeaf;
  }


  public int getSortNumber() {
    return sortNumber;
  }

  public void setSortNumber(int sortNumber) {
    this.sortNumber = sortNumber;
  }


  public int getDealState() {
    return dealState;
  }

  public void setDealState(int dealState) {
    this.dealState = dealState;
  }

}
