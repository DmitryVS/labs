import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("1.Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). Перед созданием массива подумайте, какого он будет размера.\n" +
                "2.Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).\n" +
                "3.Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.\n" +
                "4.Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.\n" +
                "5.Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.\n");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int s1;
            s1 = sc.nextInt();
            if ((s1 != 1) && (s1 != 2) && (s1 != 3) && (s1 != 4) && (s1 != 5) && (s1 != 6) && (s1 != 7)) {
                System.out.println("Введены не верные значения!");
            }
            System.out.println("Задание номер " + s1);

            switch (s1) {
                case 1: {//1
                    int j = 0;
                    int[] mass = new int[10];
                    for (int i = 1; i <= 20; i++) {
                        if (i % 2 == 0) {
                            mass[j] = i;
                            j++;
                        }
                    }
                    for (int i = 0; i < mass.length; i++) {
                        System.out.print(mass[i] + " ");
                    }
                    System.out.println();
                    for (int i = 0; i < mass.length; i++) {
                        System.out.println(mass[i]);
                    }
                    break;
                }
                case 2: {//2
                    int t = 0;
                    int[] mass2 = new int[50];
                    for (int i = 1; i < 100; i++) {
                        if (i % 2 != 0) {
                            mass2[t] = i;
                            t++;
                        }
                    }
                    for (int i = 0; i < mass2.length; i++) {
                        System.out.print(mass2[i] + " ");
                    }
                    System.out.println();
                    for (int i = mass2.length - 1; i >= 0; i--) {
                        System.out.print(mass2[i] + " ");
                    }
                }
                case 3: {//3
                    int y = 0;
                    int[] mass3 = new int[15];
                    for (int i = 0; i < 15; i++) {
                        mass3[i] = (int) (Math.random() * 10);
                    }
                    for (int i = 0; i < mass3.length; i++) {
                        System.out.print(mass3[i] + " ");
                        if (mass3[i] % 2 == 0) {
                            y++;
                        }
                    }
                    System.out.println();
                    System.out.print("Чётных чисел в массиве: " + y);
                }
                case 4: {//4
                    int[][] mass4 = new int[8][5];
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 5; j++) {
                            mass4[i][j] = (int) (Math.random() * 89 + 10);
                            System.out.print(mass4[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
                case 5: {//5
                    int[][] mass5 = new int[7][4];
                    int m=1;
                    int p=1;
                    int b=0;
                    int tt=1;
                    int rr;
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 4; j++) {
                            mass5[i][j] = (int) (Math.random() * 10 - 5);
                            System.out.print(mass5[i][j] + " ");
                        }
                        System.out.println();
                    }

                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 4; j++) {
                            rr=Math.abs(mass5[i][j]);
                            m = (p * (rr));
                            p = m;
                        }

                        if(m>b){
                            b = m;
                            tt=i+1;
                        }
                        m=1;
                        p=1;
                    }

                    System.out.print("Индекс строки с наибольшим по модулю произведением элементов: " + tt);
                }
            }
        } else{
            System.out.println("Вы ввели не целое число");
        }
    }
}