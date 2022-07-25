package org.example.day8;

public class Node<T,E> {
    public T value;
    public E key;
    public Node next;
    public  Node(T value, E key){
        this.value = value;
        this.key = key;
    }
    public static <T> void  print(T data){
        System.out.println(String.valueOf(data));
    }

    public static void main(String[] args){
        print("whalefall-halo");
    }

}
