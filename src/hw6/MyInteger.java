/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author PZdunczyk
 */
public class MyInteger {
    
    public static void main(String []args){
        MyInteger a = new MyInteger(5);
        int z=5;
        String r = "556473";
        System.out.println(a.getInteger());
        System.out.println(a.isEven());
        System.out.println(a.isOdd());
        System.out.println(a.isPrime());
        System.out.println(MyInteger.parseInt(r));
        System.out.println(a.equals(z, a));
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private int value =2;
    
    
    public  MyInteger() {}
    public MyInteger(int value){
        this.value=value;
    }

    public void setInteger(int n) {
        value = n;
    }
    public int getInteger(){
        return value;
    }
    
    public boolean isEven() {
        int n = value % 2;
        
        if(n==0)
            return true;
        
        return false;
    
    
    
    }

    public boolean isOdd() {
        int n = value % 2;
        
        if(n==1)
            return true;
        return false;
    }
    public boolean isPrime() {
        int n = 0;
        
        for(int i = 3; i < value ; i++){
             n = value % i ;
        
             if(n == 0) {
                 return false;
                 
             }
        }
     return true;
    }
    public static boolean isEven(int n) {
        int z = n %2;
        if(z ==0)
            return true;
     return false;
    }
    public static boolean isOdd(int n) {
        int z = n %2;
        if(z==1)
            return true;
        return false;
        }
    public static boolean isPrime(int h) {
        int n = 0;
        
        for(int i = 3; i < h ; i++){
             n = h % i ;
        
             if(n == 0) {
                 return false;
                 
             }
        }
     return true;
        }
    
    
    public static boolean isEven(MyInteger h){
        return h.isEven();
       }
    public static boolean isOdd(MyInteger h) {
       return h.isOdd();
    }

    public static boolean isPrime(MyInteger h ) {
     return h.isPrime();
        
    }
    
    public boolean equals(int h, MyInteger a) {
        if(h==a.value)
            return true;
        return false;
           
        
     }
    
    public static int parseInt(String s){
        char[]a = s.toCharArray();
        int result =0;
        for(char x:a)
            result = result*10 +(x-'0');
        return result;
        
        
        
    }




}