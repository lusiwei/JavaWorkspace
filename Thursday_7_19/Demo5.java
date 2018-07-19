package Thursday_7_19;

import javax.swing.*;
import java.awt.*;

/**
 * 多种布局管理器的使用
 */
public class Demo5 extends JFrame {
    //定义组件
    JPanel jp1, jp2;
    JButton jb1,jb2,jb3,jb4,jb5, jb6;
    public static void main(String[] args) {
        Demo5 d5 = new Demo5();
    }

    public Demo5() {
        //创建组件
        //Jpanel布局默认是流布局
        jp1 = new JPanel();
        jp2 = new JPanel();

        jb1 = new JButton("西瓜");
        jb2 = new JButton("苹果");
        jb3 = new JButton("荔枝");
        jb4 = new JButton("葡萄");
        jb5 = new JButton("桔子");
        jb6 = new JButton("香蕉");

        //设置布局
        //添加Panel
        jp1.add(jb1);
        jp1.add(jb2);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);

        //panel加入JFrame
        this.add(jp1, BorderLayout.NORTH);
        this.add(jp2, BorderLayout.SOUTH);
        this.add(jb3, BorderLayout.CENTER);

        //设置窗体属性
        this.setTitle("多种布局管理器");
        this.setSize(300, 300);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
