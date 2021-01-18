/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajo3;
import java.util.*;
/**
 *
 * @author Martin Ortega Yung 18020
 * Cristopher Barrios 18207
 */
public class GnomeSort {
    
    static void gnomeSort(ArrayList<Comparar> arr, int n) 
    { 
        //Creamos el index con el cual vamos a movernos en el arraylist.
        int index = 0; 
        
        // Ordenamos el arraylist
        while (index < n) { 
            if (index == 0) 
                index++; 
            if (arr.get(index).compareTo(arr.get(index-1)) == 1 || arr.get(index).compareTo(arr.get(index-1)) == 0) 
                index++; 
            else { 
                int temp = 0; 
                temp = arr.get(index).n1; 
                arr.get(index).n1 = arr.get(index - 1).n1; 
                arr.get(index - 1).n1 = temp; 
                index--; 
            } 
        } 
        return; 
    } 
    
}
