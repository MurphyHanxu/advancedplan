package hwday4;

public class hwday4_11 {
    public static void main(String[] args) {

        // 定义数组
        int [] arr = new int []{1,2,3,4,5};
        // 调用打印数组方法
        print(arr);
    }
    public static void print(int arr []){
        System.out.print("[");
        for(int i = 0; i < arr.length;i++){
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + "," );
        }
        System.out.println("]");
    }
}
