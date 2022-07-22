package hwday4;

import java.util.Random;

public class hwday4_10 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = new int [6];
        // 调用方法存随机数到数组中
        grade(arr);
        // 打印所有成绩
        print(arr);
        // 计算最终成绩
        int avg = average(arr);
        // 打印最终成绩
        System.out.println("最终成绩为：" + avg);
    }
    // 定义打印数组方法
    public static void print(int [] arr){
        System.out.print("评委打的分数：[");
        for(int i = 0;i < arr.length;i++){
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
    // 定义产生随机数方法
    public static void grade(int [] arr){
        // 创建一个随机数对象，用于生产0-100的随机分数
        Random random = new Random();
        // 创建随机数
        for(int i = 0; i < arr.length;i++){
            // 创建随机类
            arr[i] = random.nextInt(101);
        }
    }
    // 定义计算最终成绩的方法
    public static int average(int [] arr){
        // 定义三个变量存储最大值、最小值、总和
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            int data = arr[i];
            if(data > max) max = data;
            if(data < min) min = data;
            // 计算总和
            sum += data;
        }
        int avg = (sum - max - min)/(arr.length - 2);
        return avg;
    }
}
