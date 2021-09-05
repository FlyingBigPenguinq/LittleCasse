package Annotation_model;

/**
 * 自定义接口
 */
public @interface Test {
    String name() default "";
    int age();
}
