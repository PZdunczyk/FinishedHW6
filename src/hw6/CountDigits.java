/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author patryk
 */ //SB ID 109794853
public class CountDigits {

   
    public static void main(String[]args){
        String s = "264536281894";
        
        int []b = CountDigits.count(s);
        
        for(int i =0;i<b.length;i++)
            System.out.print(b[i]);
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static int[] count(String s) {
        int[] table = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String[] b = s.split("");
        for (int i = 0; i < s.length(); i++) {
            int x = Integer.parseInt(b[i]);

            table[x] += 1;

        }
        return table;

    }

}
