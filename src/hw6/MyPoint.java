/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author Patryk Zdunczyk 109794853
 */
public class MyPoint {
    
    public static void main(String[]args){
        MyPoint a = new MyPoint(0,0);
        MyPoint b = new MyPoint(10,30.5);
        System.out.print(MyPoint.getDistance(b, a));
        
        
        
        
    }
    
    
    
    
    private double x=0;
    private double y=0;
    
   MyPoint(){
       x=0;
       y=0;
   }
    
   MyPoint(double x, double y) {
       this.x = x;
       this.y = y;
   }
   
   
   public double getX(){
       return x;
   }
   public double getY(){
       return y;
   }

   public static double getDistance(MyPoint i, MyPoint j) {
       double a = i.getX();
       double b = i.getY();
       double c = j.getX();
       double d = j.getY();
       
       double product = Math.pow(c-a, 2)+ Math.pow(d-b, 2);
       double distance= Math.sqrt(product);
       return distance;
       }


























}
