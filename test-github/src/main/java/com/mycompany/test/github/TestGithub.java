/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test.github;

import java.util.Scanner;

/**
 *
 * @author User
 */


public class TestGithub{
     
  private static Scanner input = new Scanner(System.in);  
     // this to get the  number of the  numbers 
    public static  int checkint() {
     System.out.println("enter the number of the  numbers need to inserts to add: "); 
      int x; 
       
      
      try { 
            x = input.nextInt(); 
          
      }catch(Exception e) { 
          System.out.println("only numbers are allowed !!!!");
            return checkint();
      }
       return x; 
     }
     // this for varifying the  number
    public static int numberofNumbers() { 
        System.out.println("enter the number of the  numbers need to inserts: "); 
        int num = -1; 
  
        try { 
               num = input.nextInt();  
               return num;
        }catch(Exception e) { 
            System.out.println("only numbers please!!!");
            numberofNumbers();
        }
        
        return num;
    }
    
    // this is for getting the  sum 
    public static int getSum() { 
         int[]arr = new int[numberofNumbers()]; 
         int sum = 0; 
         int i = -1;
         for( ; ++i < arr.length; ) { 
             arr[i] = checkint();
             sum += arr[i]; 
         }
        
        return sum;
    }
    
     
    public static void main(String[] args) {
        System.out.println("Hello World!");
         getSum();
         
        
         
         
    }
}
