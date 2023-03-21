/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import com.mycompany.lab7.Problem01;
import com.mycompany.lab7.LinearSearch;
import com.mycompany.lab7.BubbleSort;
import com.mycompany.lab7.BinarySearch;
import static com.mycompany.lab7.LinearSearch.search;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        //test for linearSerach 
        LinearSearch ls = new LinearSearch();
        int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
        int x = 7;
        int result1 = ls.search(arr1, x);
        System.out.println(result1); //7
        
        //test for binarySearch
        BinarySearch bs = new BinarySearch();
        int[] arr2 ={0,1,2,3,4,5,6,7,8,9};
        int key = 5;
        int low = 0;
        int high = 10;
        int result2 = bs.runBinarySearchIteratively(arr2,5,0,10);
        System.out.println(result2);//5
        
        //test for BubbleSort
        BubbleSort buS = new BubbleSort();
        int [] arr3 = {8,6,2,3,4,7,1,5,9,0};
        int size = arr3.length;
        buS.bubbleSort(arr3,size);
        for(int a:arr3){
            System.out.print(a+","); // 0,1,2,3,4,5,6,7,8,9,
        }
        System.out.println("");
        
        //test for SumofPrimes
        Problem01 p=new Problem01();
        int n = 100;
        long sum = p.getSumOfPrimes(n);
        System.out.println(sum); // 1060
    }
   
}
