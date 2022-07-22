package org.example.day5;

public class Main {
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 18;
        stu1.theClass = "一班";

        Student stu2 = new Student();
        stu1.name = "李四";
        stu1.age = 20;
        stu1.theClass = "一班";

        Student stu3 = new Student("王五");
        stu1.name = "王四";
        stu1.age = 20;
        stu1.theClass = "一班";
        System.out.println("");

        System.out.println(ClassEnum.CLASS_1.name());
    }
}
