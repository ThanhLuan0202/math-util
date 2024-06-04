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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityDDTTest {
    
    //chuẩn bị bộ data đưa vào hàm getFactorial()
    //chuẩn bị bộ data kết quả trả về từ hàm
    //0! -> 1, 1! -> 1, 2! -> 2, 3!-> 6, 4! -> 24 ...
    //{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
     public static Object[][] initData() {
         
         return new Object[][]{
             {0, 1}, 
             {1, 1}, 
             {2, 2}, 
             {3, 6}, 
             {4, 24},
             {5, 120},
             {11, 39916800},
         };
     }
     
     @ParameterizedTest
     @MethodSource("initData")
     public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
         assertEquals(expected, MathUtility.getFactorial(n));
         
     }
}
