package com.learning.java;

public class DataTypes {
	public void printAll() {
		this.printStatement("Welcome to data types!");
		this.printStatement("They are 2 types in Data Type:");
		this.printStatement("Primitive Data & Non-Primitive Data");
		this.printStatement("Primitive Data : boolean 1b, char 2by, byte 1by, short 2by, int 4by, long 8by, float 4by, double 8by");
		this.printStatement("Non Primitive Data : string, array, class, interface");
		this.printStatement("1:byte = 8bits");

	}
	private void printStatement(String args) {
		System.out.println(args);
	}

}
