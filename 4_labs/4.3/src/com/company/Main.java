package com.company;

import java.util.Scanner;
import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.*;

public class Main {

    public static int rand(int a, int b) {
        if (a < b){
            return (int)floor(random()*(b-a+1) + a);}
        return (int)floor(random()*(a-b+1) + b);
    }

    public static void vis(int[] arr) {
        for (int i = 0; i <=14; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] mass, int b) {
        switch (b) {
            case 1:
                Arrays.sort(mass);
                break;
            case 2:
                for (int i = 0; i < mass.length; i++) {
                    int min = mass[i];
                    int min_i = i;
                    for (int j = i+1; j < mass.length; j++) {
                        if (mass[j] < min) {
                            min = mass[j];
                            min_i = j;
                        }
                    }
                    if (i != min_i) {
                        int tmp = mass[i];
                        mass[i] = mass[min_i];
                        mass[min_i] = tmp;
                    }
                }
                break;
            case 3:
                for(int i = mass.length-1 ; i > 0 ; i--){
                    for(int j = 0 ; j < i ; j++){
                        if( mass[j] > mass[j+1] ){
                            int tmp = mass[j];
                            mass[j] = mass[j+1];
                            mass[j+1] = tmp;
                        }
                    }
                }
                break;
        }
    }

    public static void main(String[] args) {
        System.out.print("Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.\n");
        int[]  mass= new int[15];
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int s1,s2,s3;
            s1 = sc.nextInt();
            System.out.println("Введите целое число:");
            s2 = sc.nextInt();
//основной код
            for (int i = 0; i <=14; i++){
            mass[i] = rand(s1, s2);}
            System.out.println("Массив:");
            vis(mass);
            System.out.println();
            System.out.println("Выберите сортировку которой отсортировать массив по возростанию:\n" +
                                "1. - Усовершенствованный алгоритм Быстрой сортировки (Quicksort)(Arrays.sort()).\n" +
                                "2. - Сортировка выбором (Selection sort)\n" +
                                "3. - Сортировка пузырьком (Bubble sort)\n");
            System.out.println("Введите целое число:");
            s3 = sc.nextInt();
            if ((s3 != 1) && (s3 != 2) && (s3 != 3)) {
                System.out.println("Введены не верные значения!");
            }
            sort(mass,s3);
            vis(mass);
//основной код
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
