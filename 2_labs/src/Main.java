import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static int methodMin (int a,int b) {
        if(a<b){return a;}
        if(a>b){return b;}
        else
        return a;
    }

    public static int Min (int a,int b,int c,int d) {
        int q=methodMin (a,b),w=methodMin (c,d);
        if(q<w){return q;}
        if(q>w){return w;}
        else
            return q;
    }
    public static String metodObl (double a, double b){
       if(a<0){if(b<0){return "Точка лежит в плоскости №3";}if(b>0){return "Точка лежит в плоскости №2";}}
       if(a>0){if(b<0){return "Точка лежит в плоскости №4";}if(b>0){return "Точка лежит в плоскости №1";}}

           return "Точка лежит на координатной прямой";
        }



    public static void main(String[] args) {


        System.out.println(
                "Введите число соответствующее номеру задания:\n"+
                "1.\tИспользуя цикл for вывести на экран чётные числа от 1 до 100 включительно. Через пробел либо с новой строки.\n" +
                "2.\tРисуем прямоугольник Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок. \n" +
                "3.\tРисуем треугольник. Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10. \n" +
                "4.\t Ввести с клавиатуры два числа, и вывести на экран минимальное из них (Поиск минимума выполняется в функции).\n" +
                "Задания повышенной трудности:\n" +
                "5.\tСравнить имена. Ввести с клавиатуры два имени. Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».\n" +
                "6.\tМинимум четырех чисел Написать функцию, которая вычисляет минимум из четырёх чисел. Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b).\n" +
                "7.\tКоординатные четверти Ввести с клавиатуры два числа, которые будут координатами точки, не лежащей на координатных осях OX и OY. Вывести на экран номер координатной четверти, в которой находится данная точка.\n");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int s1;
            s1 = sc.nextInt();
            if ((s1 != 1) && (s1 != 2) && (s1 != 3) && (s1 != 4) && (s1 != 5) && (s1 != 6) && (s1 != 7)) {
                System.out.println("Введены не верные значения!");
            }
            System.out.println(s1);

            switch(s1) {
                case 1:
                    String ch = "";
                    for (int i = 0; i <= 100; i += 2) {
                        ch += i + " |";
                    }
                    System.out.println(ch);
                    System.out.println("Выведены все чётные числа от 0 до 100");
                    break;
                case 2:
                    System.out.println("Введите число строк:");

                    int st2;
                    if (sc.hasNextInt()) {
                        st2 = sc.nextInt();
                        if (st2 > 25) {
                            System.out.println("В связи особенности способа визуализации было принято решение ограничиться 25 'клетками'.");
                            break;
                        }
                    } else {
                        System.out.println("Вы ввели не целое число");
                        break;
                    }

                    System.out.println("Введите число столбцов:");
                    int sb2;
                    if (sc.hasNextInt()) {
                        sb2 = sc.nextInt();
                        if (sb2 > 25) {
                            System.out.println("В связи особенности способа визуализации было принято решение ограничиться 25 'клетками'.");
                            break;
                        }
                    } else {
                        System.out.println("Вы ввели не целое число");
                        break;
                    }
                    String sd = "__";
                    for (int stroc = 0; stroc <= st2; stroc++) {
                        for (int stolb = 0; stolb < sb2; stolb++) {
                            if (stroc == 0) {
                                sd += "_";
                            } else if ((stolb == sb2 - 1) && (stroc == st2)) {
                                sd += "\u03318|";
                            } else if ((stolb == 0) && (stroc == st2)) {
                                sd += "|" + "\u03318";
                            } else if ((stroc == st2) && (stolb != 0) && (stolb != sb2 - 1)) {
                                sd += ("\u03318");
                            } else if ((stolb != 0) && (stolb != sb2 - 1)) {
                                sd += 8;
                            } else if ((stolb == 0) && (stroc != st2)) {
                                sd += "|8";
                            } else if (stolb == sb2 - 1) {
                                sd += "8|";
                            }
                        }
                        System.out.println(sd);
                        sd = "";
                    }
                    break;
                case 3:
                    String strok = "";
                    for (int i = 0; i < 10; i++) {
                        strok += 8;
                        System.out.println(strok);
                    }
                    break;
                case 4:
                    int s4_1=0;
                    if (sc.hasNextInt()) {
                        s4_1 = sc.nextInt();
                    } else {
                        System.out.println("Введены не верные значения!");
                    }
                    int s4_2=0;
                    if (sc.hasNextInt()) {
                        s4_2 = sc.nextInt();
                    } else {
                        System.out.println("Введены не верные значения!");
                    }
                    System.out.println(methodMin(s4_1,s4_2));
                    break;
                case 5:
                    String sc5_1 = sc.next();
                    String sc5_2 = sc.next();
                    if(Objects.equals(sc5_1, sc5_2)){
                        System.out.println("Имена одинаковые");}
                        else{
                            if((sc5_1.length())==(sc5_2.length())){
                             System.out.println("Длины имен равны");
                            }
                    }
                    break;
                case 6:
                    System.out.println("Введите первое число из 4:");
                    int sb6_1, sb6_2,sb6_3,sb6_4;
                    if (sc.hasNextInt()) {
                        sb6_1 = sc.nextInt();
                    } else {
                        System.out.println("Вы ввели не целое число");
                        break;}
                    System.out.println("Введите второе число из 4:");
                    if (sc.hasNextInt()) {
                     sb6_2 = sc.nextInt();
                    } else {
                        System.out.println("Вы ввели не целое число");
                        break;}
                    System.out.println("Введите третье число из 4:");
                    if (sc.hasNextInt()) {
                     sb6_3 = sc.nextInt();
                    } else {
                        System.out.println("Вы ввели не целое число");
                        break;}
                    System.out.println("Введите последнее число из 4:");
                    if (sc.hasNextInt()) {
                     sb6_4 = sc.nextInt();
                    } else {
                        System.out.println("Вы ввели не целое число");
                        break;}
                    System.out.println(Min(sb6_1,sb6_2,sb6_3,sb6_4));
                    break;
                case 7:
                    double sb7_1, sb7_2;
                    System.out.println("Введите первое число(координату x):");
                    if (sc.hasNextDouble()) {
                        sb7_1 = sc.nextDouble();
                    } else {
                        System.out.println("Вы ввели не число");
                        break;}
                    System.out.println("Введите второе число(координату y):");
                    if (sc.hasNextDouble()) {
                        sb7_2 = sc.nextDouble();
                    } else {
                        System.out.println("Вы ввели нечисло");
                        break;}
                    System.out.println(metodObl(sb7_1,sb7_2));
                    break;
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
