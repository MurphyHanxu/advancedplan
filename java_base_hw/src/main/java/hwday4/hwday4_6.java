package hwday4;

public class hwday4_6 {
    public static void main(String[] args) {

        // 创建数组
        int arr [] = {68,27,95,88,171,996,51,210};
        // 进行求和运算
        int sum = sum(arr);
        // 打印结果
        System.out.println("计算结果为：" + sum);
    }
    public static int sum(int [] arr){
        // 定义结果变量
        int sum = 0;
        // 循环数组中所有元素
        for(int i = 0;i < arr.length;i++){
            int data = arr[i];
            // 判断是否符合求和条件
            if(data / 10 % 10 != 7 && data % 2 == 0){
                sum += data;
            }
        }
        return sum;
    }
}
