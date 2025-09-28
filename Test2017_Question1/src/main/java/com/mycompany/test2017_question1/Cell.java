/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2017_question1;

/**
 *
 * @author lab_services_student
 */
public abstract class Cell implements iPrintable{

    
    // Variables
    String customerName;
    int talkTime;
    int priceperMinute;
    
    // Constructor 
    public Cell(String customerName, int talkTime, int priceperMinute) {
        this.customerName = customerName;
        this.talkTime = talkTime;
        this.priceperMinute = priceperMinute;
    }
    
    // Getters 
    public String getCustomerName() {
        return customerName;
    }

    public int getTalkTime() {
        return talkTime;
    }

    
    public int getPriceperMinute() {
        return priceperMinute;
    }
    
}
