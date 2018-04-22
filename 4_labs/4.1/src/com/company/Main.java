package com.company;

import static java.lang.Math.floor;//округление дробного числа в меньшую сторону
import static java.lang.Math.random;
import java.util.Scanner;

public class Main {

    public static int rand(int a, int b) {
        if (a < b){
            return (int)floor(random()*(b-a+1) + a);}

        return (int)floor(random()*(a-b+1) + b);
    }

    public static void main(String args[]) {
        System.out.print("Создать статический метод, который будет иметь два целочисленных параметра a и b, \n" +
                "и в качестве своего значения возвращать случайное целое число из отрезка [a;b]. \n" +
                "C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.\n");

        int[]  mass= new int[20];
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int s1,s2;
            s1 = sc.nextInt();
            System.out.println("Введите целое число:");
            s2 = sc.nextInt();
//основной код
        for (int i = 0; i <=19; i++){
            mass[i] = rand(s1, s2);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
//основной код
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
