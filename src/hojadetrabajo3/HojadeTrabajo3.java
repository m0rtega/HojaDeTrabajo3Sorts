/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajo3;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
import java.io.*;

/**
 *
 * @author Martin Ortega Yung 18020
 * Cristopher Barrios 18207
 */
public class HojadeTrabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos nuestro arraylist que será utilizado para almacenar los números.
       ArrayList<Comparar> myList = new ArrayList<Comparar>();
       //Creamos la cantidad de numeros a ser creados.
       int count = ThreadLocalRandom.current().nextInt(10, 3001);
       //Esta variable contendrá los numeros random que meteremos a nuestro archivo de text.
       int ran;      
       //Instanciamos todos nuestros sorts.
       QuickSort quick = new QuickSort();
       GnomeSort gnome = new GnomeSort();
       RadixSort radix = new RadixSort();
       MergeSort merge = new MergeSort();
       SelectionSort selec = new SelectionSort();
            //Creamos nuestro archivo de texto.
            try{
            String line = null;
            BufferedReader bufferedReader = null;
            File newFile = new File("algo.txt");
            if(!newFile.exists()){
                    newFile.createNewFile();
                }
            //Instanciamos nuestro writer.
            PrintWriter pw = new PrintWriter(newFile);
                   //Imprimimos los numeros random en un archivo de texto.
            for(int i = 0; i<count; i++){
                ran = ThreadLocalRandom.current().nextInt(0, 10);
               pw.print(ran);
            }
            //Cerramos el writer.
            pw.close();
            //Leemos el archivo.
            FileReader fileReader = new FileReader("algo.txt");
            bufferedReader = new BufferedReader(fileReader);
                        //El reader lo lee y mete cada numero en un espacio del arraylist.
            while((line = bufferedReader.readLine()) != null) {
                char[] datos = line.toCharArray();
                for(int i=0; i<datos.length; i++){
                    Comparar com = new Comparar((int)Character.getNumericValue(datos[i]));
                    myList.add(com);
                }
                //Este sort es utilizado como ejemplo, pero lo puede reemplazar con cualquier sort ya creado en el proyecto.
                selec.sort(myList);
                //Se imprime el resultado ya ordenado.
                for(int i=0; i<myList.size(); i++){
                    System.out.println(myList.get(i).n1);
                }
                }
                    //Cerramos el reader.
                    bufferedReader.close();
            
                } catch(IOException e){
                    System.out.println("Esto no sirve.");
                }

                    
            }

    }
    

