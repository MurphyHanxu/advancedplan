package hwday4;

public class hwday4_4 {
    public static void main(String[] args) {
        // 调用获取兔子对数方法
        getNumber();
    }
    // 创建获取兔子对数方法
    public static void getNumber(){
        // 创建一个数组存放兔子每个月数量
        int [] arr = new int [20];
        // 前两个月兔子对数都为1
        arr [0] = arr [1] = 1;
        for(int i = 2;i < arr.length;i++){
            arr[i] = arr [i-1] + arr[i - 2];
        }
        // 打印第二十个月的兔子对数
        System.out.println("第二十个月的兔子对数为: " + arr[19]);
    }
}
