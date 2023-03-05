/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author anasa
 */
public class Senior extends Student {
    private int credits;
    
    public Senior(String name, int age, int credits) throws Exception {
        super(name, age, credits);
        if (credits < 85){
            Exception e =new Exception (
            "You must have 85 or more credits to be a senior");
            throw e;
        }  
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    } 
    
    @Override
    public String toString(){
        if (this.getAddress() == null) {
            this.setAddress("No address was enteres");
        }
        return "Name: " + this.getName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "GPA: " + + this.getGpa() + "\n" +
                "Credits: " + this.getCredits() + "\n" +
                "Address: " + this.getAddress() + "\n";        
    }
}
