package com.example.demo;

public class eample2 {
        public static void main(String[] args) {
            int[] myArray = {3, 2, 34, 5, 76};

           // 计算数组元素累乘
        int product = 1;
        for (int i = 0; i < myArray.length; i++) {
            product *= myArray[i];
        }
        System.out.println("Product of Array Elements: " + product);
    }
}
}

