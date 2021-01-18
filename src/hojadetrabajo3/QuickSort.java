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
public class QuickSort {
    
    int partition(ArrayList<Comparar> arr, int low, int high) 
    { 
        Comparar pivot = new Comparar(arr.get(high).n1);  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr.get(j).compareTo(pivot)==-1 || arr.get(j).compareTo(pivot)==0) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr.get(i).n1; 
                arr.get(i).n1 = arr.get(j).n1; 
                arr.get(j).n1 = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr.get(i+1).n1; 
        arr.get(i+1).n1 = arr.get(high).n1; 
        arr.get(high).n1 = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(ArrayList<Comparar> arr, int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
}
