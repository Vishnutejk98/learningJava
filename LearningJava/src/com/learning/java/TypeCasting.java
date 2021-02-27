package com.learning.java;

public class TypeCasting {
public void printAll() {
	//Type Casting they are 2 types of type casting 
	//Implicit Type Casting (Widening): Storing a variable of a smaller data type to a larger data type.
	//Explicit Typecasting (Narrowing): Storing variable of a larger data type to a smaller data type.
	
	//Implicit 
	int a = 123;
	long b = a;
	
	System.out.println("Implicit : "+b);
	
	//Explicit
	long c = 1234;
	int d = (int) c;
	
	System.out.println("Explicit : "+d);
}
}
