package hwday5.hwday5_1;

public class TeacherTest {
    public static void main(String[] args) {
        // 创建教师对象
        Teacher teacher = new Teacher();
        // 进行赋值
        teacher.name = "HaiCoder";
        teacher.id = "20191024";
        // 调用 teach() 方法输出结果
        teacher.teach();
    }
}
