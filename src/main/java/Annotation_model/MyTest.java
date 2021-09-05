package Annotation_model;

public class MyTest {

    @TestTable  //该方法可测试
    public static void m1(){}
    public static void m2(){}

    @TestTable
    public static void m3() throws IllegalAccessException {
        throw new IllegalAccessException("参数出错");
    }
    public static void m4(){}

    @TestTable
    public static void m5(){}
    public static void m6(){}

    @TestTable
    public static void m7(){
        throw new RuntimeException("程序业务 出现异常！！");
    }
    public static void m8(){}
}
