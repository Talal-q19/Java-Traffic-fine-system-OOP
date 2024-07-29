/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fineoop;

/**
 *
 * @author talal
 */
public class SpeedLimit {
    private int speed;
 

   

    public int SpeedLimit(int speed) {
        int fine=0;
        if(speed <80)
            System.out.println("under speed limit");
        else if (speed >=80 && speed<=90)
            System.out.println("fine is " + (fine=fine+100 ));
        else if (speed >=91 && speed<=120)
            System.out.println("your fine " + (fine=200));
        else if (speed >=121 && speed<=140)
            System.out.println("your fine " + (fine=300));
        else
            System.out.println("your fine " + (fine=500));
        return fine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
       this.speed=speed;
    }
    
}
