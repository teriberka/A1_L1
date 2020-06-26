package ru.gb.a1.l1.hometask;

public class Main {
    public static void main(String args[]){

        System.out.println(exponentiation(5,2));

        int[] testArray = {1,2,3,-4,5,-6,-5,7,8,9,0};

        System.out.println(minElementArray(testArray));

    }

    // задание 1.1 | Возведение в степень
    public static int exponentiation(int digit, int exponentiation){
        return (int) Math.pow(digit, exponentiation);
    }

    // задание 1.2 | Поиск минимального элемента в массиве
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

}
