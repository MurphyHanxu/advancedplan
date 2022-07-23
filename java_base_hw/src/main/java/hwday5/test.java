package hwday5;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.deepToString(ns));//返回列表形式[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]

        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(", ");
            }
            System.out.println();
            //1,2,3,4,
            //5,6,7,8,
            //9,10,11,12,
        }
    }
}
