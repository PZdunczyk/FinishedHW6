/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class NewClass {
    

    public static void main(String []args){
        String a = "01djhwqleuhdsal";
        
        
        
        
        
        
        
        String b = NewClass.sort(a);
        
        
        
        
    }

    public static String sort(String s){
        
        String passthrough = "0123456789ABCDEGFHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String [] f = passthrough.split("");
        
        String b[]= s.split("");
        String c[] = passthrough.split("");
        
        
        
        for(int i = 0; i<b.length;i++){
            for(int n = 0; n<f.length;n++)
                if(f[n]==b[i])
                    c[i]=b[i];
            
                
                
            
            
        }
            
        String output = c.();
        
        
        
        
        
        return output;
    
    
    
    
    }
    
    
    







}
