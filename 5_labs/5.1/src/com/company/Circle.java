package com.company;

import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.Math.sqrt;



public class Circle {

    private int x,x1;
    private int y,y1;
    private int radius,radius1;

    //метод задающий данные окружности
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
        System.out.println("Введите координату первой окружности X (целое число):");
    Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
        this.x = sc.nextInt();
        System.out.println("Введите координату первой окружности Y (целое число):");
        this.y = sc.nextInt();
        System.out.println("Введите радиус первой окружности (целое число)");
        this.radius = sc.nextInt();
    } else {
        System.out.println("Вы ввели не целое число");
    }

        System.out.println("Введите координату X второй окружности (целое число):");
        if (sc.hasNextInt()) {
        this.x1 = sc.nextInt();
        System.out.println("Введите координату Y второй окружности (целое число):");
        this.y1 = sc.nextInt();
        System.out.println("Введите радиус второй окружности (целое число)");
        this.radius1 = sc.nextInt();
    } else {
        System.out.println("Вы ввели не целое число");
    }

}

    // метод вычисляющий длину окружности
    public double length(int n) {
        if(n==1){return 2*Math.PI*radius;}else{
        return 2*Math.PI*radius1;}
    }

    //методы задающий рандомные координаты центру окружности
    public void rand_centerx(int n) {
        if(n==1){
         x = (int)floor(random()*199 - 99);
         y = (int)floor(random()*199 - 99);
        }
        x = (int)floor(random()*199 - 99);
        y = (int)floor(random()*199 - 99);
    }

    public String get_coords(int n) {
        if(n==1){
        return ("(" + this.x + "; " + this.y + "; "+ "Радиус:"+ this.radius+")");
        }
        return ("(" + this.x1 + "; " + this.y1 + "; " + "Радиус:"+ this.radius1+")");
    }


    public double get_distance_to() {

        return sqrt(pow(this.x - this.x1, 2) + pow(this.y - this.y1, 2));
        

    }
    

     // @return true если окружности касаются хотя бы в одной точке
    public boolean is_touching() {
        double dist = this.get_distance_to();
        // Если центр окружности не внутри друой окружности
        if (dist > this.radius && dist > this.radius1)
            // Если расстояние между центрами окружностей больше суммы радиусов то они не касаются
            return (this.radius + this.radius1 >= dist);
        
        // Если центродной окружности внутри друой
        else {
            if (this.radius < this.radius1)
                return (dist + this.radius >= this.radius1);
            else
                return (dist + this.radius1 >= this.radius);
        }
    }

    //true если окружности касаются только лишь в одной точке
    public boolean is_tangent_to() {
        double dist = this.get_distance_to();
        
        // Если центр одной окружности не внутри друой
        if (dist > this.radius && dist > this.radius1)

            //Если расстояние между центрами окружностей равно сумме радиусов то они касаются
            return (this.radius + this.radius1 == dist);
        
        // Если центр окружности внутри друой окружности, центры не совпадают
        else if (dist > 0) {
            if (this.radius < this.radius1)
                return (dist + this.radius == this.radius1);
            else
                return (dist + this.radius1 == this.radius);
        }
        
        // Если центры совпадают, окружности не могут касаться только в одной точке
        else return false;
    }
}
