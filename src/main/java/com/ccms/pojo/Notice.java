package com.ccms.pojo;


public class Notice {

  private String id;
  private String userId;
  private String title;
  private String content;
  private String operatetime;
  private int type;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getOperatetime() {
    return operatetime;
  }

  public void setOperatetime(String operatetime) {
    this.operatetime = operatetime;
  }


  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

}
