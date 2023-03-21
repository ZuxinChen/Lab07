/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    
    //Time complexity : O(n^2)
    //Space complexity : O(1)
    
    Problem01 p = new Problem01();  
    int sum =0;
    for(int i=2;i<n;++i){ 
        if(p.checkPrime(i)){
            sum+=i;
        }
    }
        return sum;
    }
     boolean checkPrime(int num){       
        for(int i=2; i<=num/2; ++i){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    
    
}
