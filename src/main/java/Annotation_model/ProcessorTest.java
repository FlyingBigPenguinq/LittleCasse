package Annotation_model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProcessorTest {

    public static void process(String clazz) throws ClassNotFoundException {
        int passed = 0;
        int failed = 0;

        for (Method m: Class.forName(clazz).getMethods()){
            //如果这个类被TestTable修饰
            if (m.isAnnotationPresent(TestTable.class)){
                try{
                    //执行这个方法
                    m.invoke(null);
                    //测试成功
                    passed++;
                } catch (Exception e) {
                    e.printStackTrace();
                    failed++;
                }
            }
        }

        System.out.println(passed + failed);
    }
}
