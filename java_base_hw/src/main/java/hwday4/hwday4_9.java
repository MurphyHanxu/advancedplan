package hwday4;

public class hwday4_9 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {19, 28, 37, 46, 50};
        // 打印反转前数组
        System.out.print("数组反转前：");
        print(arr);
        // 调用反转方法
        reserve(arr);
        // 打印反转后数组
        System.out.print("数组反转后：");
        print(arr);
    }
    // 定义打印数组
    public static void print(int [] arr){
        System.out.print("[");
        for(int i = 0;i < arr.length;i++){
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
    // 定义反转方法
    public static int []  reserve(int [] arr){
        for(int i = 0,j = arr.length - 1;i < j;i++,j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
