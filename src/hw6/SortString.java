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

import java.util.*;





public class SortString {
    
    public static void main(String[]args){
        
        String s = "aslidjaslkjd123";
        String b = SortString.sort(s);
        System.out.print(b);
        
        
        
        
        
    }

    public static String sort(String s){
        char[]a= s.toCharArray();
        
        
        Arrays.sort(a);
        
        String b= String.valueOf(a);
        return b;
        
        
        
        
        
        
    }





















}
