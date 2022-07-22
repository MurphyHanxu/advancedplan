package hwday4;

public class hwday4_12 {
    public static void main(String[] args) {

        // 定义数组
        int [] arr = new int []{1,2,3,4,5};
        // 定义要交换的数组角标
        int a = 1;
        int b = 3;
        // 调用打印方法，打印交换前数组元素
        System.out.print("交换前数组为：");
        print(arr);
        // 调用交换数组元素的方法
        exchange(arr,a,b);
        // 调用打印方法，打印交换后数组元素
        System.out.print("交换后数组为：");
        print(arr);
    }
    // 定义打印方法
    public static  void print(int [] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length;i++){
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + "," );
        }
        System.out.println("]");
    }
    // 定义交换数组元素的方法
    public static void exchange(int arr [],int a,int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
