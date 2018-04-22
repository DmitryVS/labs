package com.company;
import java.util.Scanner;

//7.1.1-------------------------------
class Cow
{
    public void printAll()
    {
        printColor();
        printName();
    }
    public void printColor()
    {
        System.out.println("Я – белый");
    }
    public void printName()
    {
        System.out.println("Я – корова");
    }
}

class Whale extends Cow
{
    public void printName()
    {
        System.out.print("Я не корова,  ");
        System.out.println("Я – кит");
    }
}
//-------------------------------
//7.1.3-------------------------------
class Cats{
    public Cats(){
        super();
    }
    public void getChild(){
        System.out.println("Котенок");
    }
}

class Dogs extends Cats{
    public Dogs(){
        super();
    }
    public void getChild(){
        System.out.println("Щенок");
    }
}
//-------------------------------


public class Main {
//7.1.2-------------------------------
    public static void polim(Cats a){ System.out.println("Кошка");}
    public static void polim(Dogs a){System.out.println("Собака");}
    public static void polim(Cow a){System.out.println("Птица");}
    public static void polim(Whale a){System.out.println("Лампа");}
//-------------------------------
//Задачи на перегрузку методов-------------------------------
    public static int print(int a){
        return 1;
    }
    public static Integer print(Integer a){
        return 2;
    }
    public static int print(String a){
        return 1;
    }
    public static int print(int a, long t){
        return 10;
    }
    public static int print(String a, int e){
        return 123;
    }
    public static int print(int a, int e){
        return 10;
    }
    public static int min(int a, int b){
        if(a<b) return a;
        else return b;
    }
    public static long min(long a, long b){
        if(a<b) return a;
        else return b;
    }
    public static double min(double a, double b){
        if(a<b) return a;
        else return b;
    }
    public static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    public static long max(long a, long b){
        if(a>b) return a;
        else return b;
    }
    public static double max(double a, double b){
        if(a>b) return a;
        else return b;
    }
//-------------------------------
    public static void main(String[] args) {

        Cow a = new Whale();
        a.printAll();

        System.out.println("Введите 1-Кошка , 2-Собака , 3-Птица , 4-Лампа ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int s1;
            s1 = sc.nextInt();
            if ((s1 != 1) && (s1 != 2) && (s1 != 3) && (s1 != 4)) {
                System.out.println("Введены не верные значения!");
            }
            switch (s1){
                case 1:
                    polim( new Cats());
                    break;
                case 2:
                    polim( new Dogs());
                    break;
                case 3:
                    polim( new Cow());
                    break;
                case 4:
                    polim( new Whale());
                    break;
            }
        }else {
            System.out.println("Вы ввели не целое число");
        }
        int e=0 ;
        Integer r=0;

        print(e);
        print(r);


    }
}
