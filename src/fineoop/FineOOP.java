/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fineoop;

import java.util.Scanner;

/**
 *
 * @author talal
 */
public class FineOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner ( System.in);
        for (int i = 0; i < 3; i++) {
            
        
        System.out.println("enter speed ");
        
        int speed= input.nextInt();
        
        SpeedLimit s1= new SpeedLimit();
        s1.SpeedLimit(speed);
        
        
        BlackPoints b1 = new BlackPoints();
        b1.BlackPoints(speed);
        int fine=s1.SpeedLimit(speed);
        
       Discount d1= new Discount();
              
        if(speed>=80)
                d1.Discount( fine);
            else
                System.out.println("no discount because no fine was detected ");
        
        }
        
        
    }
    
}
