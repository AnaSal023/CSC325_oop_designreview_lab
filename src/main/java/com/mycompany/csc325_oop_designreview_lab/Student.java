
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    //GPA field
    private double gpa;
    //credit field
    private int credits;
    //default constructor
    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    
    //implemented and overrride the asbtract methods of the abstract Human class
    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
    //created get and set methods of the GPA field
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
	// ToDo 4: Add comments to your code
    //created get and set methods for credits field
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
}