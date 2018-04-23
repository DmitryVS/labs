package com.company;
import java.util.*;

class lab83Cat{
    public String name;
    public lab83Cat(){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя:\t");
        name=sc.nextLine();
    }
}

 class lab8 extends lab83Cat {
    public static void lab81(){
        Set<String> set=new HashSet<String>();
        set.add("Арбуз");
        set.add("Дыня");
        set.add("Жень-шень");
        set.add("Банан");
        set.add("Ежевика");
        set.add("Вишня");
        set.add("Груша");
        set.add("Земляника");
        set.add("Ирис");
        set.add("Картофель");
        for (String text : set)
        {
            System.out.println(text);
        }
    }
    public static void lab82(){
        Map<String, String> map=new HashMap<String,String>();
        map.put("Арбуз","ягода");
        map.put("Дыня","овощ");
        map.put("Жень-шень","корень");
        map.put("Банан","трава");
        map.put("Ежевика","куст");
        map.put("Вишня","ягода");
        map.put("Груша","фрукт");
        map.put("Земляника","ягода");
        map.put("Ирис","цветок");
        map.put("Картофель","клубень");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }

    }
    public static void lab83(){
        Map<String, lab83Cat> map=new HashMap<String,lab83Cat>();
        lab83Cat p1=new lab83Cat();
        lab83Cat p2=new lab83Cat();
        lab83Cat p3=new lab83Cat();
        lab83Cat p4=new lab83Cat();
        lab83Cat p5=new lab83Cat();
        lab83Cat p6=new lab83Cat();
        lab83Cat p7=new lab83Cat();
        lab83Cat p8=new lab83Cat();
        lab83Cat p9=new lab83Cat();
        lab83Cat p0=new lab83Cat();
        map.put("Кот1", p1);
        map.put("Кот2",p2);
        map.put("Кот3",p3);
        map.put("Кот4",p4);
        map.put("Кот5",p5);
        map.put("Кот6",p6);
        map.put("Кот7",p7);
        map.put("Кот8",p8);
        map.put("Кот9",p9);
        map.put("Кот10",p0);
        Iterator<Map.Entry<String, lab83Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, lab83Cat> pair = iterator.next();
            String key = pair.getKey();
            lab83Cat value = pair.getValue();
            System.out.println(key + " - " + value);
        }
        Iterator<Map.Entry<String, lab83Cat>> iterator1 = map.entrySet().iterator();
        System.out.println("Ключи:");
        while (iterator1.hasNext())
        {
            Map.Entry<String, lab83Cat> pair = iterator1.next();
            String key = pair.getKey();
            System.out.println(key);
        }
        Iterator<Map.Entry<String, lab83Cat>> iterator2 = map.entrySet().iterator();
        System.out.println("Значения:");
        while (iterator2.hasNext())
        {
            Map.Entry<String, lab83Cat> pair = iterator2.next();
            lab83Cat value = pair.getValue();
            System.out.println(value);
        }
    }
    public static void lab86(){
        Map<String, Object> map=new HashMap<String,Object>();
        Object[] obj=new Object[10];
        for(int i=0;i<10;i++)
        {
            obj[i]=Math.ceil(Math.random() * 1000);
        }
        map.put("Объект1",obj[0]);
        map.put("Объект2",obj[1]);
        map.put("Объект3",obj[2]);
        map.put("Объект4",obj[3]);
        map.put("Объект5",obj[4]);
        map.put("Объект6",obj[5]);
        map.put("Объект7",obj[6]);
        map.put("Объект8",obj[7]);
        map.put("Объект9",obj[8]);
        map.put("Объект10",obj[9]);
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Object> pair = iterator.next();
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите номер задания");
        int t=0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) t=sc.nextInt();
        else System.out.println("Введены неверные значения");
        switch (t) {
            case 1:
                lab8.lab81();
                System.exit(0);
            case 2:
                lab8.lab82();
                System.exit(0);
            case 3:
                lab8.lab83();
                System.exit(0);
            case 4:
                lab8.lab86();
                System.exit(0);
        }
    }
}
