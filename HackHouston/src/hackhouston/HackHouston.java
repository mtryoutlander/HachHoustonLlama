/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackhouston;

import java.util.Random;

/**
 *
 * @author Markus
 */
public class HackHouston {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] array= new int[20];
        Random ran = new Random();
       
        
        for(int i=0 ;i<array.length;i++){
            array[i] = ran.nextInt();
        }
        for(int i=0 ;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
        
        
        System.out.println("here a test if i can commit all this");
        
    }
    
}
