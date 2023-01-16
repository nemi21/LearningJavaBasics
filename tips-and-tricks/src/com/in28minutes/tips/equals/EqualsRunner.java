package com.in28minutes.tips.equals;

import java.util.Objects;

class Clinet {
	private int id;

	public Clinet(int id) {
		super();
		this.id = id;
	}
	//equals
	//hashcode

	@Override
	public int hashCode() {
		// return Objects.hash(id);
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (getClass() != that.getClass())
			return false;
		Clinet other = (Clinet) that;
		return id == other.id;
	}
	
	
}

public class EqualsRunner {

	public static void main(String[] args) {
		Clinet c1 = new Clinet(1);
		Clinet c2 = new Clinet(1);
		Clinet c3 = new Clinet(2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

	}

}
