/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajo3;

import java.util.ArrayList;

/**
 *
 * @author Martin Ortega Yung 18020
 * Cristopher Barrios 18207
 */
public class SelectionSort {
     void sort(ArrayList<Comparar> arr) 
    { 
        int n = arr.size(); 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr.get(j).n1< arr.get(min_idx).n1) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr.get(min_idx).n1; 
            arr.get(min_idx).n1 = arr.get(i).n1; 
            arr.get(i).n1 = temp; 
        } 
    } 
}
