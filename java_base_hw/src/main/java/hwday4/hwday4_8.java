package hwday4;

import java.util.Scanner;

public class hwday4_8 {
    public static void main(String[] args) {

        // 创建数组
        int[] arr = {19, 28, 37, 46, 50};
        // 创建键盘录入类
        Scanner sc = new Scanner(System.in);
        // 提示用户输入
        System.out.println("请输入一个整数：");
        // 获取键盘输入数据
        int a = sc.nextInt();
        int dataIndex = getDataIndex(arr,a);
        if(dataIndex == -1){
            System.out.println("您输入的数据在数组中不存在！");
        }else{
            System.out.println("您输入的数字" + a + "在数组中的索引是：" + dataIndex);
        }
    }
    // 定义获取索引的方法
    public static int getDataIndex(int [] arr,int a){
        for(int i = 0;i < arr.length;i++){
            if(a == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
