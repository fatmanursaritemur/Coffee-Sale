package com.turkcell.entities.concretes;

import com.turkcell.entities.abstracts.IEntity;


public class Branch implements IEntity {

  private int branchId;
  private int numberOfEmployees;

  private String location;
  private String managerName;

  public Branch(int branchId, String location, int numberOfEmployees, String managerName) {
    this.branchId = branchId;
    this.location = location;
    this.numberOfEmployees = numberOfEmployees;
    this.managerName = managerName;
  }

  public int getBranchId() {
    return branchId;
  }

  public void setBranchId(int branchId) {
    this.branchId = branchId;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  public String getManagerName() {
    return managerName;
  }

  public void setManagerName(String managerName) {
    this.managerName = managerName;
  }
}
