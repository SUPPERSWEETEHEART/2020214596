package com.example.demo;

public class eample3 {
    public static void main(String[] args) {
        // 创建一个整型数组
        int[] myArray = {13, 48, 31, 63, 59, 62};

        // 冒泡排序（从小到大）
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    // 交换元素
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }

        // 打印排序后的数组
        System.out.print("Sorted Array (Ascending): ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}
