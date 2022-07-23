package hwday5.hwday5_2;

public class Phone {
    public String brand;
    public int price;
    public String color;
    // 打电话方法
    public void call(){
        System.out.println("正在使用价格为:" + price + "元黑色的" + brand + "手机打电话....");
    }
    // 发短信方法
    public void sendMessage(){
        System.out.println("正在使用价格为:" + price + "元黑色的" + brand + "手机发短信....");
    }
}
