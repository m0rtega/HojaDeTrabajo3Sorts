/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajo3;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Martin Ortega Yung 18020
 * Cristopher Barrios 18207
 */
public class RadixSortTest {
    
    public RadixSortTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getMax method, of class RadixSort.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        ArrayList<Comparar> arr = null;
        int n = 0;
        int expResult = 0;
        int result = RadixSort.getMax(arr, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countSort method, of class RadixSort.
     */
    @Test
    public void testCountSort() {
        System.out.println("countSort");
        ArrayList<Comparar> arr = null;
        int n = 0;
        int exp = 0;
        RadixSort.countSort(arr, n, exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class RadixSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        ArrayList<Comparar> arr = new ArrayList<Comparar>();
        arr.get(0).n1 = 2;
        arr.get(1).n1 = 3;
        arr.get(2).n1 = 1;
        RadixSort instance = new RadixSort();
        instance.sort(arr, arr.size() -1);
        ArrayList<Comparar> arr2 = new ArrayList<Comparar>();
        arr2.get(0).n1 = 1;
        arr2.get(1).n1 = 2;
        arr2.get(2).n1 = 3;
        assertEquals(arr2, arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
