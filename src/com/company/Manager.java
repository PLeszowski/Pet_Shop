package com.company;

/**
 * Created by RENT on 2017-06-02.
 */
public class Manager {

	private String LastName;
	private double totalCommission;
	private static int numOfManagers = 0;

	public Manager(String lastName) {
		LastName = lastName;
		numOfManagers++;
	}

	public String getLastName() {
		return LastName;
	}

	public double getTotalCommission() {
		return totalCommission;
	}

	public void setTotalCommission(double totalCommission) {
		this.totalCommission = totalCommission;
	}

	public static int getNumOfManagers() {
		return numOfManagers;
	}
}
