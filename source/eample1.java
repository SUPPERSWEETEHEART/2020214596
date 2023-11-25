package com.example.demo;

public class eample1 {
    public static void main(String[] args) {
        // 创建一个整型数组
        int[] myArray = {1, 23, 51, 7, 29};

        // 计算数组元素总和
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("累计和为: " + sum);
    }
}

