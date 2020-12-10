package com.java.exercises.operations;

public class MathemathicOperations {
	
	// void no espera ningun retorno
	public double getResidue(double numA, double numB) {
		double result;
		result = numA%numB; // + - * / %
		return result;
	}
	
	// char byte int float double long
	public static void main(String [] args ) {
		MathemathicOperations operation = new MathemathicOperations();
		double result;
		result = operation.getResidue(10, 3);
		
		System.out.println("Result: "+result);
		
	}
	

	
}
