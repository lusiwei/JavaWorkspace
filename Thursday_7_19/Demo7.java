package Thursday_7_19;

import javax.swing.*;
import java.awt.*;

public class Demo7 extends JFrame {
    //定义组件
    JPanel jp1,jp2, jp3;
    JLabel jl1, jl2;
    JButton jb1, jb2;
    JCheckBox jcb1,jcb2, jcb3;
    JRadioButton jrb1, jrb2;
    public static void main(String[] args) {
        Demo7 d7 = new Demo7();
    }

    public Demo7() {
        //创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jl1 = new JLabel("你喜欢的运动");
        jl2 = new JLabel("你的性别");

        jb1 = new JButton("注册用户");
        jb2 = new JButton("取消注册");

        jcb1 = new JCheckBox("足球");
        jcb2 = new JCheckBox("篮球");
        jcb3 = new JCheckBox("网球");

        jrb1 = new JRadioButton("男");
        jrb2 = new JRadioButton("女");
        //一定要把jrb1,jrb2放入体格ButtonGroup中
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);

        //设置布局管理
        this.setLayout(new GridLayout(3, 1));

        //添加组件
        jp1.add(jl1);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);

        jp2.add(jl2);
        jp2.add(jrb1);
        jp2.add(jrb2);

        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        //设置窗口属性
        this.setTitle("666");
        this.setSize(300, 200);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
