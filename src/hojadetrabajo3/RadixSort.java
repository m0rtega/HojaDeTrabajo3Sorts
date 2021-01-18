/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajo3;
    import java.io.*; 
import java.util.*; 
/**
 *
 * @author Martin Ortega Yung 18020
 * Cristopher Barrios 18207
 */
public class RadixSort {
    
    // A utility function to get maximum value in arr[] 
    static int getMax(ArrayList<Comparar> arr, int n) 
    { 
        Comparar mx = new Comparar(arr.get(0).n1); 
        for (int i = 1; i < n; i++) {
            if (arr.get(i).compareTo(mx) == 1){
                mx.n1 = arr.get(i).n1; 
            }
        }
        return mx.n1; 
    } 
  
    // A function to do counting sort of arr[] according to 
    // the digit represented by exp. 
    static void countSort(ArrayList<Comparar> arr, int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        // Store count of occurrences in count[] 
        for (i = 0; i < n; i++) 
            count[ (arr.get(i).n1/exp)%10 ]++; 
  
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Build the output array 
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr.get(i).n1/exp)%10 ] - 1] = arr.get(i).n1; 
            count[ (arr.get(i).n1/exp)%10 ]--; 
        } 
  
        // Copy the output array to arr[], so that arr[] now 
        // contains sorted numbers according to curent digit 
        for (i = 0; i < n; i++) 
            arr.get(i).n1 = output[i]; 
    } 
  
    // The main function to that sorts arr[] of size n using 
    // Radix Sort 
    static void sort(ArrayList<Comparar> arr, int n) 
    { 
        // Find the maximum number to know number of digits 
        int m = getMax(arr, n); 
  
        // Do counting sort for every digit. Note that instead 
        // of passing digit number, exp is passed. exp is 10^i 
        // where i is current digit number 
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    } 
}
