/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;
import java.util.*;

/**
 *
 * @author PFA Young Lee
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int counter;
        Random rNum = new Random();
        
        for (counter = 1; counter <= 7; counter++) {
            System.out.println(rNum.nextInt(270));
            
        }
        
    }
    
}
