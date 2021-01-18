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
public class MergeSort{
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(ArrayList<Comparar> arr, int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        ArrayList<Comparar> L = new ArrayList<Comparar>();
        ArrayList<Comparar> R = new ArrayList<Comparar>(); 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L.add(arr.get(l + i)); 
        for (int j=0; j<n2; ++j) 
            R.add(arr.get(m + 1+ j)); 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L.get(i).compareTo(R.get(j)) == -1 || L.get(i).compareTo(R.get(j)) == 0) 
            { 
                arr.get(k).n1 = L.get(i).n1; 
                i++; 
            } 
            else
            { 
                arr.get(k).n1 = R.get(j).n1; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr.get(k).n1 = L.get(i).n1; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr.get(k).n1 = R.get(j).n1; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(ArrayList<Comparar> arr, int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
}
