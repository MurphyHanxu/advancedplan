package hwday4;

public class hwday4_7 {
    public static void main(String[] args) {

        // 创建数组
        int[] arr1 = {10 , 30 , 50 , 70 , 90};
        int[] arr2 = {10 , 30 , 50 , 70 , 90};
        int[] arr3 = {10 , 30 , 50 , 80 , 100};
        int[] arr4 = {10 , 30 , 50 , 80};
        System.out.println("arr1 与 arr2 是否相同：" + compare(arr1,arr2));
        System.out.println("arr1 与 arr3 是否相同：" + compare(arr1,arr3));
        System.out.println("arr1 与 arr4 是否相同：" + compare(arr1,arr4));
    }
    public static boolean compare(int [] arr1,int [] arr2){
        if(arr1.length == arr2.length){
            for(int i = 0;i < arr1.length;i++){
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
