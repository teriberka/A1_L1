package ru.gb.a1.l1.hometask;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){

        System.out.println(exponentiation(5,2));

        int[] testArray = {1,2,3,-4,5,-6,-5,7,8,9,0};
        System.out.println("Тестовый массив = " + Arrays.toString(testArray));

        System.out.println("Минимальный элемент массива = " + minElementArray(testArray));

        System.out.println("Средне арифмитическо массива = " + average(testArray));

    }

    // задание 1.1 | Возведение в степень
    // сложность алгоритма на мой взгляд O(log(n)).

//    public static int exponentiation (int a, int n) {
//        if (n == 0)
//            return 1;
//        if (n % 2 == 1)
//            return exponentiation (a, n-1) * a;
//        else {
//            int b = exponentiation (a, n/2);
//            return b * b;
//        }
//    }

    public static int exponentiation(int digit, int exponentiation){
        return (int) Math.pow(digit, exponentiation);
    }



    // задание 1.2 | Поиск минимального элемента в массиве
    // сложность алгоритма на мой взгляд O(n), где n - число элементов в массиве.
    public static int minElementArray(int[] arr){
        int x = arr[0];

        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(i);
            if (x >= arr[i]) {
                x = arr[i];
            }
        }
        return x;
    }

    // задание 1.3 | Нахождение среднего арифметического массива
    // сложность алгоритма O(n + 1), где n - число элементов в массиве. В данном случае единицей можно принебречь,
    // поэтому итоговая рассчетная сложность равно O(n).
    public static double average (int[] arr){
        int x = 0;

        for (int i = 0; i < arr.length ; i++) {
            x += arr[i];
        }
        System.out.println("Cумма всех элементов массива = " + x);

        return (double) x / arr.length;
    }
}
