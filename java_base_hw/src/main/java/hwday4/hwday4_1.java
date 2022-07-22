package hwday4;

public class hwday4_1 {
    public static void main(String[] args) {
    // 调用 getMax 方法，获取最大值
    int max = getMax(10,50,30);
    // 打印结果
        System.out.println(max);
    }
    public static int getMax(int a,int b, int c){
        // 定义 max 变量
        int max = a;
        // if 条件判断出最大值
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        // 返回最大值
        return max;
    }
}

