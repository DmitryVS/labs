package com.company;
import java.util.Scanner;

//7.2.1 и 7.2.2 ----------------------------------------------
abstract class Pets{
    protected int age;
    protected String name;
    protected boolean hungry;
    public Pets(){
        Scanner in = new Scanner(System.in);
        System.out.print("Age:\t");
        if(in.hasNextInt()) age=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("Name:\t");
        name=in.nextLine();
        System.out.print("Hungry:\t");
        if(in.hasNextBoolean()) hungry=in.nextBoolean();
        else System.out.println("Введены неверные значения");
    }
    public abstract void voice();
}

class Snake extends Pets{
    public Snake(){
        super();
    }
    public void voice(){
        System.out.println("Пшшш");
    }
}

class Dogg extends Pets{
    public Dogg(){
        super();
    }
    public void voice(){
        System.out.println("Гав");
    }
}

class PatrolDog extends Pets{
    public PatrolDog(){
        super();
    }
    public void voice() {
        System.out.println("Гав!Гав!");
    }
}

class Cat extends Pets{
    public Cat(){
        super();
    }
    public void voice() {
        System.out.println("Мяу");
    }
}

class Fish extends Pets{
    public Fish(){
        super();
    }
    public void voice() {
        System.out.println("___");
    }
}
//----------------------------------------
//7.2.3----------------------------------------
interface PassangersAuto{
    void passtravel();
}

interface CargoAuto{
    void cargotravel();
}

class Truck implements CargoAuto, PassangersAuto{
    public void passtravel(){

    }
    public void cargotravel(){

    }
}

class Sedan implements CargoAuto, PassangersAuto{
    public void passtravel(){

    }
    public void cargotravel(){

    }
}

class Pickup implements CargoAuto, PassangersAuto{
    public void passtravel(){

    }
    public void cargotravel(){

    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
