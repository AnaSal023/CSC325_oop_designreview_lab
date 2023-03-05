/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) throws Exception {
            
            double scannerGPA;
                
		Student std1 = new Freshman("James", 20, 12); // name, age, credits
                
                Student std2 = new Senior("John", 30, 90);
		
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		
                //trying if a senior student with credits less than 85 will get an error
                Student std3;
                try { std3 = new Senior("Mary", 40, 65); }
                catch (Exception e){ 
                    System.out.println(e);
                }
                
                //set up scanner object instance
                Scanner scanner = new Scanner(System.in);
                
                //asking student 2 to enter their gpa 
                System.out.println("Student 2: please enter your GPA");
                //p[assing the entered value to scanner GPA instance
                scannerGPA = Double.parseDouble(scanner.nextLine());
                //setting student gpa to scanner gpa instance
                std2.setGpa(scannerGPA);
                //printing student gpa
                System.out.println("Student 2 GPA: " + std2.getGpa());
                
		System.out.println(std1);
                
                System.out.println(std2);
		
		// ToDo 12: add comments and explain your code
		
		// ToDo 13: submit using a pull request.
	}

}