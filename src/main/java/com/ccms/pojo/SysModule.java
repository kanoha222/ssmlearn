package com.ccms.pojo;


public class SysModule {

  private String moduleCode;
  private String moduleName;
  private String modulePath;
  private String parentCode;
  private int isLeaf;
  private int sortNumber;


  public String getModuleCode() {
    return moduleCode;
  }

  public void setModuleCode(String moduleCode) {
    this.moduleCode = moduleCode;
  }


  public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }


  public String getModulePath() {
    return modulePath;
  }

  public void setModulePath(String modulePath) {
    this.modulePath = modulePath;
  }


  public String getParentCode() {
    return parentCode;
  }

  public void setParentCode(String parentCode) {
    this.parentCode = parentCode;
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

}
