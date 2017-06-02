package com.company;

/**
 * Created by RENT on 2017-06-02.
 */
public class Worker {

	private String LastName;
	private double totalCommission;
	private static int numOfWorkers = 0;

	public Worker(String lastName) {
		LastName = lastName;
		numOfWorkers++;
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

	public static int getNumOfWorkers() {
		return numOfWorkers;
	}
}
