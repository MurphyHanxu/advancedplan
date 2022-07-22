package hwday4;

public class hwday4_2 {
    public static void main(String[] args) {

        // 定义数字0
        double num1 = 0;
        // 定义正小数
        double num2 = 10;
        // 定义负小数
        double num3 = -15;
        // 调用获取绝对值方法
        double result1 = getnum(num1);
        double result2 = getnum(num2);
        double result3 = getnum(num3);
        // 打印结果
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    public static double getnum(double num){
        // 判断传入参数为正还是为负
        if(num >= 0){
            return num;
        }else {
            return num * -1;
        }
    }
}
