/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivz.math.util.core;

/**
 *
 * @author ADMIN
 */
//quy tắc đặt tên java
// - chữ thường toàn tập
// - ghi theo tên miền công ty đảo ngược
// - com.[tên công ty].[tên dự án].[tên module nhóm chức năng]
// - com.microsoft.sqlserver.jdbc.[tên class import vào để sử dụng]
// - đây là kĩ thuật giúp code của nhiều dự án trong 1 cty ở chung folder mà không bị lẫn lộn
// - giúp thư viện của các cty khác nhau ở chung với nhau dù trùng tên


public class MathUtility {

    //hàm tính n giai thừa
    //hàm là static vì tính xong rồi trả về thôi
    //thường các thử viện dùng chung, tính toán số liệu ta hay dùng static

    //qui ước 0! = 1! = 1
    //n = 0...20! vì n = 21! vượt 18 số 0, 18 số 0 là vừa đủ long
    public static long getFactorial(int n){
        long product = 1; // tích: kết quả phép nhân
        if (n <0 || n>20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        if (n==0 || n==1)
            return 1;
        for (int i=1;i<=n;i++)
            product *= i; //thuật toán nhân dồn, con heo đất
        return product;
    }
}