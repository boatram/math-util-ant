/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helen.mathutil.core;

/**
 *
 * @author BAOTRAM
 */
//Clone bộ thư viện/công cụ Math Util của JDK
// Giả lập các hàm của class JDK.
// Thiết kế là Static
// Static chấm trực tiếp qua tên class, CẤM NEW.
public class MathUtil {
    public static final double PI = 3.141592653589793;
    //ham tinh gia thua
    //quy uoc: 
    //ko co giai thua cho so am.
    //0! = 1!
    //21! vượt kiểu long, 18 số 0
    //Design: chỉ tính giai thừa từ 0 đến 20.
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if(n==0 || n==1) return 1;
        long product = 1; //bien tich luy
        for (int i = 2; i <= n ; i++)
            product *=i;
        return product;
    }
    
    public static void tryTDDFirst(){
        //Test case 1: n=0 hy vong expeced = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // so sanh 2 gia tri de pt ham dung hay sai
        // day la 1 testcase.
        System.out.println("0! Status: | Expected = " + expected + "Actual = " + actual);
        //0! co bang 1 hay ko?
        
        //Test case 2: n=1
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! Status: | Expected = " + expected + "Actual = " + actual);
        //Test case 3: n=2
        expected = 2;
        System.out.println("2! Status: | Expected = " + expected + "Actual = " + MathUtil.getFactorial(2));
    }
    /*Kỹ thuật lập trình mới:
     Cam kết code chất lượng.
     Kỹ thuật TDD-TEST DRIVEN DEVELOPMENT
     Viết code và viết code để test song song nhau
     Viết ngay test case để kiểm thử hàm vừa viết
     */
}
