package com.ccms.pojo;


public class SysUser {

  private String userCode;
  private String name;
  private String psw;
  private String operatorId;
  private java.sql.Timestamp operatorTime;
  private int delstate;
  private String unitId;
  private int userType;
  private String areaId;


  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPsw() {
    return psw;
  }

  public void setPsw(String psw) {
    this.psw = psw;
  }


  public String getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }


  public java.sql.Timestamp getOperatorTime() {
    return operatorTime;
  }

  public void setOperatorTime(java.sql.Timestamp operatorTime) {
    this.operatorTime = operatorTime;
  }


  public int getDelstate() {
    return delstate;
  }

  public void setDelstate(int delstate) {
    this.delstate = delstate;
  }


  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public int getUserType() {
    return userType;
  }

  public void setUserType(int userType) {
    this.userType = userType;
  }


  public String getAreaId() {
    return areaId;
  }

  public void setAreaId(String areaId) {
    this.areaId = areaId;
  }

}
