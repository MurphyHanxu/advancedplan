package hwday5.hwday5_2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "小米";
        phone.price = 3998;
        phone.color = "黑色";
        phone.call();
        phone.sendMessage();
    }
}
