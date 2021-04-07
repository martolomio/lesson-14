package com.homework.sorting;

import java.util.Scanner;

public class Phone implements Comparable<Phone> {
	
	Scanner scaner = new Scanner (System.in);
	
	private String name;
	private int length ;
	private int wigth;
	private int weight;
	public Phone(String name, int length, int wigth, int weight) {
		super();
		this.name = name;
		this.length = length;
		this.wigth = wigth;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWigth() {
		return wigth;
	}
	public void setWigth(int wigth) {
		this.wigth = wigth;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", length=" + length + ", wigth=" + wigth + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		result = prime * result + wigth;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (length != other.length)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		if (wigth != other.wigth)
			return false;
		return true;
	}
	@Override
	public int compareTo(Phone o2) {
		if(this.getName().compareTo(o2.getName())>0) {
			return 1;
		}else if(this.getName().compareTo(o2.getName())<0) {
			return -1;
		}
		return 0;
	}
	
	
	
	
}
