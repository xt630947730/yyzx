package com.ngmc.entity;


import java.io.Serializable;

public class Client implements Serializable {

  private long cliId;
  private String cliName;
  private long cliAge;
  private String cliSex;
  private long idNumber;
  private long roomId;
  private long floorId;
  private long recordId;
  private String manType;
  private java.sql.Date checkTime;
  private java.sql.Date expirationTime;
  private long telphone;
  private java.sql.Date birthday;
  private long stature;
  private long weigh;
  private String bloodType;
  private String remark;


  public long getCliId() {
    return cliId;
  }

  public void setCliId(long cliId) {
    this.cliId = cliId;
  }


  public String getCliName() {
    return cliName;
  }

  public void setCliName(String cliName) {
    this.cliName = cliName;
  }


  public long getCliAge() {
    return cliAge;
  }

  public void setCliAge(long cliAge) {
    this.cliAge = cliAge;
  }


  public String getCliSex() {
    return cliSex;
  }

  public void setCliSex(String cliSex) {
    this.cliSex = cliSex;
  }


  public long getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(long idNumber) {
    this.idNumber = idNumber;
  }


  public long getRoomId() {
    return roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }


  public long getFloorId() {
    return floorId;
  }

  public void setFloorId(long floorId) {
    this.floorId = floorId;
  }


  public long getRecordId() {
    return recordId;
  }

  public void setRecordId(long recordId) {
    this.recordId = recordId;
  }


  public String getManType() {
    return manType;
  }

  public void setManType(String manType) {
    this.manType = manType;
  }


  public java.sql.Date getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(java.sql.Date checkTime) {
    this.checkTime = checkTime;
  }


  public java.sql.Date getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(java.sql.Date expirationTime) {
    this.expirationTime = expirationTime;
  }


  public long getTelphone() {
    return telphone;
  }

  public void setTelphone(long telphone) {
    this.telphone = telphone;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public long getStature() {
    return stature;
  }

  public void setStature(long stature) {
    this.stature = stature;
  }


  public long getWeigh() {
    return weigh;
  }

  public void setWeigh(long weigh) {
    this.weigh = weigh;
  }


  public String getBloodType() {
    return bloodType;
  }

  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
