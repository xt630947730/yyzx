package com.ngmc.entity;


import java.io.Serializable;

public class Bad implements Serializable{

  private long badId;
  private long cliId;
  private java.sql.Date startingTime;
  private java.sql.Date endTime;
  private String detailed;
  private long roomId;
  private long floorId;


  public long getBadId() {
    return badId;
  }

  public void setBadId(long badId) {
    this.badId = badId;
  }


  public long getCliId() {
    return cliId;
  }

  public void setCliId(long cliId) {
    this.cliId = cliId;
  }


  public java.sql.Date getStartingTime() {
    return startingTime;
  }

  public void setStartingTime(java.sql.Date startingTime) {
    this.startingTime = startingTime;
  }


  public java.sql.Date getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Date endTime) {
    this.endTime = endTime;
  }


  public String getDetailed() {
    return detailed;
  }

  public void setDetailed(String detailed) {
    this.detailed = detailed;
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

}
