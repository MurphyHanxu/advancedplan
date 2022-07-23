package hwday5.hwday5_3;

public class StudentTest {
    public static void main(String[] args) {
    // 空参构造方法创建对象
    Student stu1 = new Student();
    stu1.setName("张三");
    stu1.setAge(20);
    stu1.show();


    // 有参构造方法创建对象
    Student stu2 = new Student("李四",18);
        stu2.show();
    }
}
