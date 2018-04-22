package com.company;

import java.util.Scanner;

public class CircleTest {
    
    public static void main(String args[]) {
        int n = 1;
        Circle cr0 = new Circle();
        while (n == 1){
            System.out.println("координаты первой окружности" + cr0.get_coords(1));
        System.out.println("координаты второй окружности" + cr0.get_coords(2));
        System.out.println("длина первой окружности: " + cr0.length(1));
        System.out.println("длина второй окружности: " + cr0.length(2));
        System.out.println("расстояние между окружностянми: " + cr0.get_distance_to());
        if (cr0.is_tangent_to() == true) {
            System.out.println("окружности касаются только один раз");
        }   else {
                if (cr0.is_touching() == true) {
                    System.out.println("окружности касаются больше одного раза");
                }   else {
                    System.out.println("окружности не касаются");
                    }
                }
        System.out.println("Изменить координаты центров окружностей на рандомные?(1-да, 2-нет)");
            int d,c;
            int a;
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {d=sc.nextInt();

            if (d==1) {
                System.out.println("Изменить координаты центров двух окружностей или только первой или только второй?(1-Только первый, 2-только второй, 3-Все)");}
                if (sc.hasNextInt()) {
                c=sc.nextInt();
                if(c==3){
                    cr0.rand_centerx(1);
                    cr0.rand_centerx(2);
                }else if (c==1){
                    cr0.rand_centerx(1);
                }else if (c==2) {
                    cr0.rand_centerx(2);
                }}}
                System.out.println("обновить? 1-да,2-нет");
                if (sc.hasNextInt()) {a=sc.nextInt(); if(a==2){n=2;}}
        }
    }
}

