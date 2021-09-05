package Annotation_model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解保留到运行时
@Retention(RetentionPolicy.RUNTIME)
//使用@Target指定被修饰的注解可以用于修饰方法
@Target(ElementType.METHOD)
public @interface TestTable {

}

//JUnit要求可测试的方法必须用test开头。如果使用@TestTable注解，可以把任何方法标记为可测试
