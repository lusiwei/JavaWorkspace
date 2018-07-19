package Thursday_7_19;

import javax.swing.*;
import java.awt.*;

/**
 * 集中常用组件
 */
public class Demo6 extends JFrame {
    //定义组件
    JPanel jp1, jp2, jp3;
    JLabel jl1, jl2;
    JButton jb1, jb2;
    JTextField jtf1, jtf2;

    public static void main(String[] args) {
        Demo6 d6 = new Demo6();
    }

    public Demo6() {
        //创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jl1 = new JLabel("管理员");
        jl2 = new JLabel("密码");
        jb1 = new JButton("登录");
        jb2 = new JButton("取消");
        jtf1 = new JTextField(10);
        jtf2 = new JPasswordField(10);

        //设置布局管理
        this.setLayout(new GridLayout(3,1));
        //添加组件
        jp1.add(jl1);
        jp1.add(jtf1);

        jp2.add(jl2);
        jp2.add(jtf2);
        jp3.add(jb1);
        jp3.add(jb1);

        //添加Jpanel到Jframe
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        //设置窗口属性
        this.setTitle("会员管理系统");
        this.setSize(300, 150);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
