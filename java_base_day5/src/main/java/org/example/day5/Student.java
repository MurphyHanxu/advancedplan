package org.example.day5;

public class Student extends People implements Action{
    public static String school = "SCU";
    public String name;
    public int age;
    public String theClass;
    public long stuId;

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age, String theClass, long stuId){
        this.name = name;
        this.age = age;
        this.theClass = theClass;
        this.stuId = stuId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void print(String name){
        System.out.println(name);
    }

    @Override
    public void eat() {
        System.out.println("Student eat");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
