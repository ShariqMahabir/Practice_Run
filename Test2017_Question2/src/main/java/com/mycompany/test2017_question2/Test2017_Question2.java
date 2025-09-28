/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2017_question2;

/**
 *
 * @author lab_services_student
 */
public class Test2017_Question2 {

    public static void main(String[] args) {
       // Question1 not Question 2 name wrong

   //global
    //2D array -- sales
    final  int[][] sales = {
        {3000, 2000, 3500},
        {2500, 5500, 3500},
        {1100, 2000, 4500},
        {1700, 2700, 2500},
        {5000, 2900, 5900}
    };
    
    final  int[] empNumber = {101111, 101122, 101133, 101144, 101155};
  
    
        
        System.out.println("Employees\tSales 1\t\tSales 2\t\tSales 3");
        
        for (int i = 0; i < sales.length; i++) {
            
            System.out.print(empNumber[i] + "\t\t");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(" R " + sales[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("*");
        System.out.println("TOTAL SALES:");
         for (int i = 0; i < sales.length; i++) {
            int totalSales = 0; //reset it for each employee
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }
             System.out.println(empNumber[i] + " -->\tR " + totalSales);
        }
    }
    
}
    

