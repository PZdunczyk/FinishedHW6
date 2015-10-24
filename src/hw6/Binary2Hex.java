/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;


    
    
    
    
    
    
    
    
    
    
    
//Patryk Zdunczyk 109794853

public class Binary2Hex {
    public static void main(String[]args){
        String binary = "111101";
        String hex = Binary2Hex.binary2Hex(binary);
        System.out.print(hex);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static String binary2Hex(String binaryValue){
        int pos = binaryValue.length();
        String hex = "";
        while(pos>=0) {
            int posMinus4 = pos-4;
            if(posMinus4<0)
                posMinus4=0;
            String last4bits = binaryValue.substring(posMinus4, pos);
            while(last4bits.length()<4)
                last4bits ="0"+last4bits;
            
            switch(last4bits){
                case "0000" :hex ="0" + hex; break;
                case "0001":hex="1" + hex; break;
                case "0010":hex = "2" + hex;break;
                case "0100":hex="4" + hex;break;
                case "0101": hex = "5"+hex;break;
                case "0110":hex = "6"+hex;break;
                case "0111": hex = "7"+hex;break;
                case "1000": hex = "8"+hex;break;
                case "1001": hex = "9"+hex;break;
                case "1010" : hex = "A"+hex; break;
                case "1011":hex = "B"+hex;break;
                case "1100": hex = "C"+hex; break;
                case "1101": hex = "D"+hex; break;
                case "1110":hex="E"+hex;break;
                case "1111":hex = "F"+hex;break;
                        
                        
                        
                        
                        
                        
            }
            pos -=4;
        }
        
        
        
            return hex;
            
           
       
    
    
    
    
    }    

        
    
    
    
    
    }
