/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.helen.mathutil.main;

import com.helen.mathutil.core.MathUtil;

/**
 *
 * @author BAOTRAM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This mesage come from Main()");
        tryTDDFirst();
    }
    
    public static void tryTDDFirst(){
        //Test case 1: n=0 hy vong expeced = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // so sanh 2 gia tri de pt ham dung hay sai
        // day la 1 testcase.
        System.out.println("0! Status: | Expected = " + expected + " Actual = " + actual);
        //0! co bang 1 hay ko?
        
        //Test case 2: n=1
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! Status: | Expected = " + expected + " Actual = " + actual);
        //Test case 3: n=2
        expected = 2;
        System.out.println("2! Status: | Expected = " + expected + " Actual = " + MathUtil.getFactorial(2));
    }
}
