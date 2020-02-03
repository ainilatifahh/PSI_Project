/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author ASUS
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int data [] = {1,2,3,4,5,9};
    int n = 9;
    int left = 0;
    int right = data.length -1;
    int tengah = left+(right-left)/2;
    if (n==data[tengah]){
        System.out.println("true");
    }
    else
        if (n<data[tengah]){
            left = tengah-1;
                    }
   
         }
             }
    
    
    
    
    }
    
}
