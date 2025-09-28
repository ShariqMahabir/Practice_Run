/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2017_question1;

/**
 *
 * @author lab_services_student
 */
public class Cell_Billing extends Cell{

    // Constructor 
    public Cell_Billing(String customerName, int talkTime, int priceperMinute) {
        super(customerName, talkTime, priceperMinute);
    }

    @Override
    public void print_bill() {
        
         int total = talkTime * getPriceperMinute();
        
        
        System.out.println("Customer Name : " + getCustomerName());
        System.out.println("Talk Time     : " + getTalkTime() + " minutes");
        System.out.println("Price/Minute  : R" + getPriceperMinute());
        System.out.println("Total Due     : R" + total);
        
        
    }
    
}
