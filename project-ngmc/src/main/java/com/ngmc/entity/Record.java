package com.ngmc.entity;


import java.io.Serializable;

public class Record implements Serializable {

  private long recId;
  private long cliId;
  private java.sql.Date nurTime;
  private String nurCon;
  private long nurNum;
  private long userId;


  public long getRecId() {
    return recId;
  }

  public void setRecId(long recId) {
    this.recId = recId;
  }


  public long getCliId() {
    return cliId;
  }

  public void setCliId(long cliId) {
    this.cliId = cliId;
  }


  public java.sql.Date getNurTime() {
    return nurTime;
  }

  public void setNurTime(java.sql.Date nurTime) {
    this.nurTime = nurTime;
  }


  public String getNurCon() {
    return nurCon;
  }

  public void setNurCon(String nurCon) {
    this.nurCon = nurCon;
  }


  public long getNurNum() {
    return nurNum;
  }

  public void setNurNum(long nurNum) {
    this.nurNum = nurNum;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
