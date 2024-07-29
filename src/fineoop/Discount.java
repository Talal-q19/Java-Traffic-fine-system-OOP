/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fineoop;

import java.util.Scanner;

/**
 *
 * @author talal
 */
public class Discount {
    private int fine; 

    public int Discount(int fine) {
          Scanner input= new Scanner(System.in);


        System.out.println("enter month fine to be paid ");
        double month= input.nextInt();


        double fine3=fine-(fine*0.35);
        double fine4=fine-(fine*0.10);
        double fine5=fine;


        if( month >=0 && month <=6)
            System.out.println("discounted fine = " + (fine3));
        else if ( month >=7 && month <= 12 )
            System.out.println("discounted fine = " + (fine4));
        else
            System.out.println("no discount available for your fine which is " + fine5 );
        return fine;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

   
    
    
}
