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
public class MergeSortTest {
    
    public MergeSortTest() {
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
     * Test of merge method, of class MergeSort.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        ArrayList<Comparar> arr = null;
        int l = 0;
        int m = 0;
        int r = 0;
        MergeSort instance = new MergeSort();
        instance.merge(arr, l, m, r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        ArrayList<Comparar> arr = new ArrayList<Comparar>();
        arr.get(0).n1 = 2;
        arr.get(1).n1 = 3;
        arr.get(2).n1 = 1;
        MergeSort instance = new MergeSort();
        instance.sort(arr, 0, arr.size() -1);
        ArrayList<Comparar> arr2 = new ArrayList<Comparar>();
        arr2.get(0).n1 = 1;
        arr2.get(1).n1 = 2;
        arr2.get(2).n1 = 3;
        assertEquals(arr2, arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
