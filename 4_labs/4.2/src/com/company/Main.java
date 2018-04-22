package com.company;

import java.util.Scanner;
import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Main {

    public static int rand(int a, int b) {
        if (a < b){
            return (int)floor(random()*(b-a+1) + a);}

        return (int)floor(random()*(a-b+1) + b);
    }

    public static void vis(int[] arr, int a, int b) {
        for (int i = 0; i <=9; i++){
            arr[i] = rand(a, b);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Создать метод, который будет выводить указанный массив на экран в строку.\n" +
                " С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов из 10 элементов\n" +
                "каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.\n");

        int[]  mass1= new int[10], mass2= new int[10],mass3= new int[10],mass4= new int[10],mass5= new int[10];
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int s1,s2;
            s1 = sc.nextInt();
            System.out.println("Введите целое число:");
            s2 = sc.nextInt();
//основной код
            vis(mass1,s1,s2);
            vis(mass2,s1,s2);
            vis(mass3,s1,s2);
            vis(mass4,s1,s2);
            vis(mass5,s1,s2);
//основной код
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
