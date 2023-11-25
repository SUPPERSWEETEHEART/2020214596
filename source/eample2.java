package com.example.demo;

public class eample2 {
        public static void main(String[] args) {
            // 创建一个整型数组
            int[] myArray = {123, 23, 304, 45, 156};

           // 计算数组元素累乘
        int product = 1;
        for (int i = 0; i < myArray.length; i++) {
            product *= myArray[i];
        }
        System.out.println("Product of Array Elements: " + product);
    }
}
}

