package hwday4;

public class hwday4_5 {
    public static void main(String[] args) {

        for(int i = 0;i < 20;i++){
            for(int j = 0;j < 33;j++){
                int k = 100 - j - i;
                if(i * 5 + j * 3 + k /3 == 100){
                    System.out.println("鸡翁：" + i + "鸡母：" + j + "鸡雏" + k);
                }
            }
        }
    }
}
