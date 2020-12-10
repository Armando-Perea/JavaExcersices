package com.java.exercises.operations;

public class MathemathicOperations {
	
	// void no espera ningun retorno
	public double getResidue(double numA, double numB) {
		double result;
		result = numA%numB; // + - * / %
		return result;
	}
	
	public double getMultiply(double numA, double numB) {
		double result;
		result = numA*numB; // + - * / %
		return result;
	}
	
	public String findNumberTen(double number) {
		String message;
		// Si el numero recibido es 10 entonces regresa mensaje de ENCONTRADO
		// Si el numero recibino NO es 10 entonces regresa mensaje de NO ENCONTRADO
		
		// == < > <= >= !
		if(number==10) {
			message = "ENCONTRADO";
		}else {
			message= "NO ENCONTRADO";
		}
		
		return message;
	}
	
	// char byte int float double long
	public static void main(String [] args ) {
		MathemathicOperations operation = new MathemathicOperations();
		double result;
		String message;
		message = operation.findNumberTen(1);
		System.out.println("Mensaje: "+message);
		
	}
	

	
}
