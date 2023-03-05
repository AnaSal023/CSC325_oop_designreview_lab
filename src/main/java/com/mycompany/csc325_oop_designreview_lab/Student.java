
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 * 
 */
public class Student extends Human{
    //GPA field
    private double gpa;
    //credit field
    private int credits;
    //default constructor
    public Student() {
        super("", 0);
        this.credits = 0;
    }

    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    
    //implemented and overrride the asbtract methods of the abstract Human class
    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
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