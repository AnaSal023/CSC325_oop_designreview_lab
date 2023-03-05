
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
    
    private double gpa;

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
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
	// ToDo 4: Add comments to your code

}