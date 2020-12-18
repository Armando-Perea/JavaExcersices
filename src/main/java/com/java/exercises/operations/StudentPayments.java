package com.java.exercises.operations;

import java.util.ArrayList;
import java.util.List;

public class StudentPayments {
	
	//Variables globales  Variables de Clase
	private static List<String> studentList = new ArrayList<>();
	
	
	// Visibilidad  - Estatico o no - Tipo de Retorno  - El nombre del metodo (Argumentos a recibir si hay)
	private List<String> addStudentToList(int idStudent,String studentName, String career, double payment) {	
		studentList.add(idStudent+" "+studentName+" "+career+" "+payment);
		return studentList;
	}
	
	private void showStudentList() {
		
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
	}
	
	
	public static void main(String[] args) {
		StudentPayments studentPayments = new StudentPayments();
		
		int idStudent;
		String studentName;
		String career;
		double payment;
		
		idStudent = 1;
		studentName= "Armando";
		career="Sistemas Computacionales";
		payment = 3500.00;
		
		int idStudent2;
		String studentName2;
		String career2;
		double payment2;
		
		idStudent2 = 2;
		studentName2= "Maggianita";
		career2="Sistemas";
		payment2 = 1500.00;
		
		int idStudent3;
		String studentName3;
		String career3;
		double payment3;
		
		idStudent3 = 3;
		studentName3= "Pegglita";
		career3="Sistemas";
		payment3 = 1500.00;
		
		studentPayments.addStudentToList(idStudent,studentName,career,payment);
		
		studentPayments.addStudentToList(idStudent2,studentName2,career2,payment2);
		
		studentPayments.addStudentToList(idStudent3,studentName3,career3,payment3);
		
		studentPayments.showStudentList();
	}
}
