package com.helen.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    @Test
    public void testFactorialGivenRightArgumentReturnWell2(){
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }
    
    @Test
    //@: ANNOTATION: la ky hieu danh dau doan code mang y nghia nao do va khi bien dich thi thu vien di kem sex tu dong generate them code tuy theo thu vien.
    //@Test dc thu vien JUnit import tu generate ham thanh PUBLIC STATIC VOID MAIN()va gui main nay cho JVM
    // Thu vien nay goi la framework: bi ep phai theo qui tac cua no qua @
    //Thu vien-library: nhung file .jar .dll chua code ep ta xai theo mau quy uoc
    //FW: 
   
    //ten ham test cho pt test cai gi
    //day la QUI UOC cuar dan kiem thu
    //ham nay test ham giai thua khi dua tham so dung va phai tra ve dung
    //CODING CONVENTION: viet code theo qui tac
    public void testFactorialGivenRightArgumentReturnWell(){
        //test case 1: ktr 0!
        //n=0, expected = 1, actual chay moi pt!!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0);//goi ham de ktra
        //so sanh 2 gia tri
        //so sanh bang xem mau, ko dung sout()
        Assert.assertEquals(expected, actual);
        
        //test case 2: ktr 1!
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        //test case 3: ktr 2!
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    @Test
    public void tryJUnitFirst(){
        Assert.assertEquals(69, 69);
    }
    
    //bat xem ngoai le co xuat hien hay ko?
    //ham getF() dc thiet ke tra ve LONG neu 0<= n <= 20
    //NEM ra ngoai le neu dua vao n<0 or n>20
    //neu goi getF(-5) thi noi goi nhan ve Exception ten ILLEGALARGUMENTEXCEPTION
    
    @Test(expected = Exception.class)
    //hy vong test nem ra Exception
    //khi chay ham nay, ktra xem co 1 Exception thuoc class IllegalArgumentException xuat hien hay ko?
    //IllegalArgumentException dc new o dau do
    //phai co xuat hien Exception => XANH
    public void testFactorialGivenWrongArgumentThrowException(){
        MathUtil.getFactorial(-5);
    }
}
//class này viết code như bth nhưng dùng để test code chính ơ mathutil
//đoạn test này gọi là TEST SCRIPT: là những code đc viết ra để test code chính.
// những code này gọi các hàm bên code chính và so sánh giá trị trả về vs giá trị kỳ vọng
// Bao gồm các TEST CASE bên trong

//QUI TAC XANH DO
//Xanh khi all test case xanh, expected == actual
//Do khi chi 1 test case do!!! Ton tai 1 expected != actual
//Bat buoc ham phai dung vs all test case
//Chi can 1 do thi ham ko on dinh ve ket qua tra ve
//Ko the test het cac case(NL2) nhung da test case nao thi phai xanh case do
//Ly do expected != actual:
//1. Expected dung khi tinh chua co ham va actual sai => Bug, ham sai
//2. Expeced sai, bo test case. Ky vong sai.

//Tach bo data kiem thu ra 1 cho: DDT
//Sau do nap/fill/feed data nay tuan tu vao cho kiem thu
//Tao ham tong quat, ko dien data cu the, lay tu dau do
//Code dep hon, de bao tri hon, kiem soat du case hon
//Ky thuat viet test case theo kieu tham so hoa: PARAMETERIZED hay DDT-DATA DRIVEN TESTING
//Viet kiem thu huong ve tach data rieng
//Assert.assertEquals(?, MathUtil.getFactorial(??));

