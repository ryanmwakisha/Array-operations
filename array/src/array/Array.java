/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Arrays;
/**
 *
 * @author PC
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray = {5, 2, 8, 3, 1, 6, 4 };
        Arrays.sort(myArray);
        
        System.out.println("Sorted Array:");
        for(int i: myArray){
            System.out.println(i + "");
        }
    }
    
}
