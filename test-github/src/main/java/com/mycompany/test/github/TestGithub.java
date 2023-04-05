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
     
    public static  int checkint() {
        
      int x; 
      Scanner input = new Scanner(System.in); 
      
      try { 
            x = input.nextInt(); 
          
      }catch(Exception e) { 
          System.out.println("only numbers are allowed !!!!");
            return checkint();
      }
       return x; 
     }
     
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
         Scanner input = new Scanner(System.in); 
         
         int arr[] = new int[5];
         int i =0;
         while(i < 5) { 
             System.out.println("please enter the  number: ");
              
            
              
             arr[i] =  checkint();
              
             i++; 
             
         }
         
         
    }
}
