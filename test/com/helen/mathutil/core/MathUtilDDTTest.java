/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.helen.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author BAOTRAM
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    @Parameterized.Parameters //dinh nghia bo data, tu dong for tren mang da nhap!!!
   public static Object[][] initData(){ // ham phai static de data tĩnh.
       int a[] = {5, 10, 15, 20, 25};
       int b[][] = {{1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6}};
       int c[][] = {{1,0},
                    {1,1},
                    {2,2},
                    {6,3},
                    {24,4},
                    {120,5},
                    {720,6}};
       
       return new Integer[][] {{1, 0},
                               {1, 1},
                               {2, 2},
                               {6, 3},
                               {24, 4},
                               {120, 5},
                               {720, 6}};
   }
   //ta phải map 2 cột của từng dòng vào 2 đầu ? của hàm so sánh
   //Assert.assertEquals(cot 0, MathUtil.getFactorial(cot 1));
   //Map value tu mang vao 2 bien, dua 2 bien vao ham so sanh
   
   @Parameterized.Parameter(value = 0)//map cot 0 vao expected
   public long expected;
   @Parameterized.Parameter(value = 1) //map cot 1 vao n
   public int n;
   
   @Test
   public void testFactorialGivenRightArgumentReturnWell(){
       assertEquals(expected, MathUtil.getFactorial(n));
   }
}