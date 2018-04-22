package com.company;
import java.util.Scanner;

 class horse {
    public String name;
    public horse(){
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка:\t");
        name=in.nextLine();
    }
}

class pegas extends horse{
    public pegas(){
        super();
    }
    public void fly(){
        System.out.println(name+" летит");
    }
}


 abstract class pet {
    protected float weight;
    protected String name;
    protected String sex;
    public pet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Вес:\t");
        if(in.hasNextFloat()) weight=in.nextFloat();
        else System.out.println("Введены неверные значения");
        System.out.print("Пол:\t");
        in.nextLine();
        sex=in.nextLine();
    }
}

class dog extends pet{
    public dog(){
        super();
        System.out.print("Name:\t");
        Scanner in = new Scanner(System.in);
        name=in.nextLine();
    }
    public void infodog(){
        System.out.print("Собака\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class cat extends pet{
    public cat(){
        super();
        System.out.print("Кличка:\t");
        Scanner in = new Scanner(System.in);
        name=in.nextLine();
    }
    public void infocat(){
        System.out.print("Кошка\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}


class fish {
    protected String a= "Это наследуется от рыб";
}

class animal extends fish{

    protected String b= "Это наследуется от животных";

}

class ape extends animal{
    protected String c= "Это наследуется от обезьян";
}

class human extends ape{
    protected String d= "Это наследуется от людей";

public void infohuman(){
        System.out.print(a+"\n"+b+"\n"+c+"\n"+d+"\n");
    }}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания(1-pegas;2-dog;3-cat;4-human(эволюция))");
        int z=0;
        if(in.hasNextInt()) z=in.nextInt();
        else System.out.println("Введены неверные значения");
        switch (z) {
            case 1: pegas a=new pegas(); a.fly(); System.exit(0);
            case 2: dog b=new dog(); b.infodog(); System.exit(0);
            case 3: cat c=new cat(); c.infocat(); System.exit(0);
            case 4: human d=new human(); d.infohuman(); System.exit(0);
        }
    }
}
