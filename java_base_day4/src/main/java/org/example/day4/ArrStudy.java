package org.example.day4;

public class ArrStudy {
    public static void main(String[] args){
        int[][] arr = new int[3][4];
        arr[1][1] = 1;
        for (int i= 0; i< arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = i * j;
            }
        }

        for (int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }


    }
}
