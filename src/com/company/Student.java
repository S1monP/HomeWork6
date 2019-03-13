package com.company;

public class Student {
    private String Name;
    private String Spek;
    private int age;

    Student(String Name, String Spek, int age) {
        this.Name = Name;
        this.Spek = Spek;
        this.age = age;
    }
        String GetSpek() { return Spek; }
        String GetName() { return Name; }
        int GetAge() { return age;}
}
