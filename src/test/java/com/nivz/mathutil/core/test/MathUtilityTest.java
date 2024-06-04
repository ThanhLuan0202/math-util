/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nivz.mathutil.core.test;

import com.nivz.math.util.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//qui tắc đặt tên package trong java
//tên miền cty đảo ngược, đi kèm thông tin dự án/project và module
//com.[tên cty].[tên dự án].[module].[tên class]
//com.giaolang.mathutil.core.
//.NET: chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sdk

/**
 *
 * @author ADMIN
 */

//class này chứa các test case dùng để test code của class chính bên MathUtility
public class MathUtilityTest {
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //test case: là bộ data đầu vào + các thao tác nhập xuất trên app/màn hinh/hàm để verify 1 hàm/màn hình/chức năng chạy đúng hay sai
    //Test case #1: check/test getF() with n = 0
    //input/given n = 0
    //Steps/Procedure (bước test)
    //call method getFactorial(n)
    //Expected Result: 1 
    //Actual Result: ???
    //Status: Passed/Failed
    
        //Framwork ép ta phải viết code theo 1 qui tắc nào đó
        //Thư viện cho viết tự do, goij hàm tự do
        //Framwork là thư viện, nhưng thư viện không hẳn là Framwork
    @Test
    public void testFactorialGivenRightArg0ReturnWell(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    
    @Test
    public void testFactorialGivenRightArg1ReturnWell(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void testFactorialGivenRightArg5ReturnWell(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    @Test
    public void testFactorialGivenRightArg1234ReturnWell(){
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
    }
    
    //chuẩn bị thấy ngoại lệ mừng rơi nước mắt
    //Test case #5: Check getF() with n = -1, the method throw exception
    @Test
    public void testFactorialGivenWrongArgNegative1ThrowException(){
        
        //MathUtility.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
    
}
