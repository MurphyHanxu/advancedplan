package org.example.day10;

public class Main {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            Task task = new Task("task" + i, i*i);
            task.start();
        }
        System.out.println("main thread end");
    }
}
