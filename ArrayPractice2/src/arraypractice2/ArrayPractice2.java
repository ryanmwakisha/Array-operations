/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraypractice2;

import java.util.Arrays;


public class ArrayPractice2 {
    
    public static void main(String[] args){
        String[] copyFrom = {
            "Affogato","Cartado","Cappuccino","Corretto","Americano","Doppio","Freddo","Frappucino","Espresso","Lungo","Macchiato","Marocchino","Ristretto"};
        
        //PARALLEL SORT
       Arrays.parallelSort(copyFrom);
        System.out.println(Arrays.toString(copyFrom));
        
        //Arrays.sort(copyFrom);
        
       // System.out.println("Sorted Array:");
        //for(String i: copyFrom){
          //  System.out.println(i + "");
               
        
      }
    
    }



