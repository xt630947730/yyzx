package com.ngmc.entity;


import java.io.Serializable;

public class Content implements Serializable {

  private long nurId;
  private String nurName;
  private long nurPrice;
  private String nurDes;
  private long nurAppreciation;
  private long nurStatee;


  public long getNurId() {
    return nurId;
  }

  public void setNurId(long nurId) {
    this.nurId = nurId;
  }


  public String getNurName() {
    return nurName;
  }

  public void setNurName(String nurName) {
    this.nurName = nurName;
  }


  public long getNurPrice() {
    return nurPrice;
  }

  public void setNurPrice(long nurPrice) {
    this.nurPrice = nurPrice;
  }


  public String getNurDes() {
    return nurDes;
  }

  public void setNurDes(String nurDes) {
    this.nurDes = nurDes;
  }


  public long getNurAppreciation() {
    return nurAppreciation;
  }

  public void setNurAppreciation(long nurAppreciation) {
    this.nurAppreciation = nurAppreciation;
  }


  public long getNurStatee() {
    return nurStatee;
  }

  public void setNurStatee(long nurStatee) {
    this.nurStatee = nurStatee;
  }

}
