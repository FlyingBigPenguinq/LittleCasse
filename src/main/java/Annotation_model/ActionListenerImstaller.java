package Annotation_model;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class ActionListenerInstaller {
    public static void processAnnotations(Object o){
        try {
            Class cl = o.getClass();
            //获取 成员变量
            for (Field f: cl.getFields()){
                //设置为可以自由访问
                f.setAccessible(true);
                //获取注解
                ActionListenerFor a = f.getAnnotation(ActionListenerFor.class);
                //获取成员变量F的值
                Object object = f.get(o);

                if (a != null && object != null && object instanceof AbstractButton){
                    Class<? extends ActionListener> listenerClazz = a.listener();
                    ActionListener al = listenerClazz.getDeclaredConstructor().newInstance();
                    var ab = (AbstractButton)object;

                    ab.addActionListener(al);
                }
            }
        } catch (IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
