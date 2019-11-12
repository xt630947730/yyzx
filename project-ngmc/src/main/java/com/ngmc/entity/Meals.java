package com.ngmc.entity;


import java.io.Serializable;

public class Meals implements Serializable {

  private long meaId;
  private long cliId;
  private java.sql.Date meaDate;
  private String meaWeek;


  public long getMeaId() {
    return meaId;
  }

  public void setMeaId(long meaId) {
    this.meaId = meaId;
  }


  public long getCliId() {
    return cliId;
  }

  public void setCliId(long cliId) {
    this.cliId = cliId;
  }


  public java.sql.Date getMeaDate() {
    return meaDate;
  }

  public void setMeaDate(java.sql.Date meaDate) {
    this.meaDate = meaDate;
  }


  public String getMeaWeek() {
    return meaWeek;
  }

  public void setMeaWeek(String meaWeek) {
    this.meaWeek = meaWeek;
  }

}
