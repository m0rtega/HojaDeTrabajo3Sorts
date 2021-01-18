/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajo3;

/**
 *
 * @author Martin Ortega Yung 18020
 * Cristopher Barrios 18207
 */
public class Comparar implements Comparable<Comparar>{
    
    //Variable que contendra el número a comparar.
    int n1;
    
    //Constructor.
    Comparar(int i){this.n1 = i;}
    
    //Metodo compareTo que compara cada n1.
    public int compareTo(Comparar n){
        if(this.n1 > n.n1){
            return 1;
        }
        else if (this.n1 < n.n1){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    public String toString(){
        return String.valueOf(this.n1);
    }
    
    public int get(){
        return this.n1;
    }
    
}
