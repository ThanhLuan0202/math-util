/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivz.math.util;

import com.nivz.math.util.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class MathUtil {

    private static long expectedValue;

//    public static void main(String[] args) {
//        //TEST CASE 01
//        //N = 0, EX VALUE: 1, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        int n = 0;
//        long expectedValue = 1;
//        long actualValue;// = ? chờ hàm trả về
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("0! Expected: " + expectedValue + " Actual: " + actualValue);
//        //TEST CASE 02
//        //N = 1, EX VALUE: 1, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! Expected: " + expectedValue + " Actual: " + actualValue);
//        //TEST CASE 03
//        //N = 5, EX VALUE: 120, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! Expected: " + expectedValue + " Actual: " + actualValue);
//        //TEST CASE 04
//        //N = -1, EX VALUE: EXCEPTION, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        System.out.println("Check if the Illegal Argument Exception");
//        n = -1;
//        try {
//            actualValue = MathUtility.getFactorial(n);
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
    
    //psvm tab tạo nhanh main
    public static void main(String[] args) {
        //cách 2 test hàm = cách popup

        int n = 0;
        long expectedValue = 1;
        long actualValue;// = ? chờ hàm trả về
        actualValue = MathUtility.getFactorial(n);
        String result = n + "! | Expected: " + expectedValue + " | Actual: " + actualValue;
        JOptionPane.showMessageDialog(null, result);

        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        result = n + "! | Expected: " + expectedValue + " | Actual: " + actualValue;
        JOptionPane.showMessageDialog(null, result);
    }
}
