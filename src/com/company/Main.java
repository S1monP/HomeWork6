package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ClassWork();
//        Test1();
//        Test2();
        Test3();
    }
        private static void ClassWork(){
            Scanner scanner = new Scanner(System.in);
            String Name, Spek;
            int age;
            Student[] School = new Student[5];
            for (int j = 0; j < School.length; j++) {
                System.out.println("Студент №" + (j + 1) + "Введите имя студента");
                Name = scanner.next();
                System.out.println("Введите специализацию студента");
                Spek = scanner.next();
                System.out.println("Введите возраст студента");
                age = scanner.nextInt();
                School[j] = new Student(Name, Spek, age);
            }
            System.out.println("Имя студента " + School[0].GetName() + " Возраст студента " + School[0].GetAge() + " Специализация студента " + School[0].GetSpek());
            System.out.println("Имя студента " + School[1].GetName() + " Возраст студента " + School[1].GetAge() + " Специализация студента " + School[1].GetSpek());
            System.out.println("Имя студента " + School[2].GetName() + " Возраст студента " + School[2].GetAge() + " Специализация студента " + School[2].GetSpek());
            System.out.println("Имя студента " + School[3].GetName() + " Возраст студента " + School[3].GetAge() + " Специализация студента " + School[3].GetSpek());
            System.out.println("Имя студента " + School[4].GetName() + " Возраст студента " + School[4].GetAge() + " Специализация студента " + School[4].GetSpek());
        }
        public static void Test1(){
            Scanner scanner = new Scanner(System.in);
            int money=0;
            boolean flag = true;
            System.out.println("Сумма задолжности 700. \nОсталось платежей 7. \nПредусмотренна возможность увеличенных. \nВведите сумму платежа от клиента(примимаються суммы кратные 100):");
            do {
                money = scanner.nextInt();
                if (money % 100 != 0){
                    System.out.println("Сумма не кратна 100 \nВведите сумму кратную 100");
                    flag = false;
                }
                else flag = true;
            }while (!flag);
            Credit(money);

        }
        public static void Credit(int money){
            int left, plat;
            left = 700-money;
            plat = left/100;
            if (left > 0) System.out.println("Задолжность " + left + "\nКоличество оставшихся платежей " + plat);
            if (left < 0) System.out.println("Переплата " + (left * -1));
            if (left == 0) System.out.println("Долг погашен");
        }
        public static void Test2(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число для проверки: ");
            int a = scanner.nextInt();
            Pol(a);
            Prost(a);
            Del(a);
        }
    public static void Pol(int a){
        System.out.println("Число " + ((a==0) ? "равно 0" : (a > 0) ? "больше 0" : "меньше 0"));
    }
    public static void Prost(int a){
        boolean d = true;
        for ( int j=2; j<a; j++) {
            if (a % j == 0) {
                System.out.println("число не простое");
                d = false;
                break;
            }
        }
        if (d) System.out.println("Число простое");
    }
    public static void Del(int a){
        if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 6 == 0 || a % 9 == 0) {
            System.out.print("Число делиться на ");
            if (a % 2 == 0) System.out.print("2 ");
            if (a % 3 == 0) System.out.print("3 ");
            if (a % 5 == 0) System.out.print("5 ");
            if (a % 6 == 0) System.out.print("6 ");
            if (a % 9 == 0) System.out.print("9 ");
        }
    }
    public static void Test3(){
        Random random = new Random();
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        Print(a);
        Sort(a);
        Print(a);
    }
    public static void Sort(int[] a){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    isSorted = false;
                    buf = a[i];
                    a[i] = a[i+1];
                    a[i+1] = buf;
                }
            }
        }
    }
    public static void Print(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("]");
    }

}
