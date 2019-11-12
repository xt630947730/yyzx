package com.ngmc.entity;


import java.io.Serializable;

public class Food implements Serializable {

  private long foodId;
  private String foodName;
  private String foodType;
  private String foodLabel;
  private long foodPrice;
  private long halal;
  private String supplyWeek;
  private String supplyType;


  public long getFoodId() {
    return foodId;
  }

  public void setFoodId(long foodId) {
    this.foodId = foodId;
  }


  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }


  public String getFoodType() {
    return foodType;
  }

  public void setFoodType(String foodType) {
    this.foodType = foodType;
  }


  public String getFoodLabel() {
    return foodLabel;
  }

  public void setFoodLabel(String foodLabel) {
    this.foodLabel = foodLabel;
  }


  public long getFoodPrice() {
    return foodPrice;
  }

  public void setFoodPrice(long foodPrice) {
    this.foodPrice = foodPrice;
  }


  public long getHalal() {
    return halal;
  }

  public void setHalal(long halal) {
    this.halal = halal;
  }


  public String getSupplyWeek() {
    return supplyWeek;
  }

  public void setSupplyWeek(String supplyWeek) {
    this.supplyWeek = supplyWeek;
  }


  public String getSupplyType() {
    return supplyType;
  }

  public void setSupplyType(String supplyType) {
    this.supplyType = supplyType;
  }

}
