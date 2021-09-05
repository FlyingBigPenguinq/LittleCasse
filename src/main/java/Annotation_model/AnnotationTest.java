package Annotation_model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnotationTest {

    private JFrame mainWin = new JFrame("");

    @ActionListenerFor(listener = OKListener.class)
    private JButton ok = new JButton("ok");

    @ActionListenerFor(listener = CancelListener.class)
    private JButton cancel = new JButton("cancel");

    public void init(){
        var jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);

        mainWin.add(jp);
        ActionListenerInstaller.processAnnotations(this);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }

    public static void main(String[] args) {
        new AnnotationTest().init();
    }
}

class OKListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "单击");
    }
}

class CancelListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "取消");
    }
}