package com.codingo.finalTest;

public class Manager extends Employee {

	private double bonus;

	/**
	 * @param name
	 * @param salary
	 * @param year
	 * @param month
	 * @param day
	 */
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		// TODO Auto-generated constructor stub
		bonus = 0;
	}

	// error because getSalary is final
	// public double getSalary() {
	// double baseSalary = super.getSalary();
	// return baseSalary + bonus;
	// }

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject))
			return false;
		Manager other = (Manager) otherObject;
		// super.equals checked that this and other belong to the same class
		return bonus == other.bonus;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + "[bonus=" + bonus + "]";
	}

}