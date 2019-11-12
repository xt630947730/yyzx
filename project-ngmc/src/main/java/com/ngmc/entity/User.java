package com.ngmc.entity;


import java.io.Serializable;

public class User implements Serializable {

  private long userId;
  private String password;
  private String userName;
  private String userSex;
  private long userAge;
  private String empType;
  private java.sql.Date entryTime;
  private String duty;
  private String thesis;
  private long telephone;
  private String intro;
  private String remark;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }


  public long getUserAge() {
    return userAge;
  }

  public void setUserAge(long userAge) {
    this.userAge = userAge;
  }


  public String getEmpType() {
    return empType;
  }

  public void setEmpType(String empType) {
    this.empType = empType;
  }


  public java.sql.Date getEntryTime() {
    return entryTime;
  }

  public void setEntryTime(java.sql.Date entryTime) {
    this.entryTime = entryTime;
  }


  public String getDuty() {
    return duty;
  }

  public void setDuty(String duty) {
    this.duty = duty;
  }


  public String getThesis() {
    return thesis;
  }

  public void setThesis(String thesis) {
    this.thesis = thesis;
  }


  public long getTelephone() {
    return telephone;
  }

  public void setTelephone(long telephone) {
    this.telephone = telephone;
  }


  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", password='" + password + '\'' +
            ", userName='" + userName + '\'' +
            ", userSex='" + userSex + '\'' +
            ", userAge=" + userAge +
            ", empType='" + empType + '\'' +
            ", entryTime=" + entryTime +
            ", duty='" + duty + '\'' +
            ", thesis='" + thesis + '\'' +
            ", telephone=" + telephone +
            ", intro='" + intro + '\'' +
            ", remark='" + remark + '\'' +
            '}';
  }
}
