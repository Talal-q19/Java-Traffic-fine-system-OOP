/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fineoop;

/**
 *
 * @author talal
 */
public class BlackPoints {
    private int speed;
    private int point;

    public int BlackPoints(int speed) {
        
          int Point=0;
        if( speed<80)
            System.out.println("no black points ");
        else if (speed >=80 && speed<=90)
            System.out.println("your black points are " + (Point=Point+2 ));
        else if (speed >=91 && speed<=120)
            System.out.println("your black points are " + (Point=Point+4));
        else if (speed >=121 && speed<=140)
            System.out.println("your black points are  " + (Point=Point+6));
        else
            System.out.println("your black points are  " + (Point=Point+21));
        return Point;
     
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    
    
}
