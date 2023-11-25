package com.example.demo;

public class eample1 {
        public static void main(String[] args) {
            // 创建一个整型数组
            int[] myArray = {1, 3, 5, 7, 9};

            // 打印整个数组
            System.out.print("Array: ");
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + " ");
            }
            System.out.println();

            // 访问数组元素
            int firstElement = myArray[0];
            System.out.println("First Element: " + firstElement);

            // 修改数组元素
            myArray[2] = 10;
            System.out.print("Modified Array: ");
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + " ");
            }
            System.out.println();

            // 遍历数组元素
            System.out.println("Array Elements:");
            for (int element : myArray) {
                System.out.println(element);
            }

            // 获取数组长度
            int arrayLength = myArray.length;
            System.out.println("Array Length: " + arrayLength);
        }
}

