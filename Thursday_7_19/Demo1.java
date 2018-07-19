package Thursday_7_19;
//引入包
import javax.swing.*;

public class Demo1 extends JFrame {
//把需要
    JButton jb1 = null;
    JRadioButton jrb = null;

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
    }

    //构造函数
    public Demo1 () {
        //创建Button按钮
        jb1 = new JButton("我是按钮");
        jrb = new JRadioButton("yes or no?", true);
        //添加JButton组件
        this.add(jb1);
        this.add(jrb);
        //设置标题
        this.setTitle("hello world");
        //设置大小
        this.setSize(200, 200);
        //设置初始位置
        this.setLocation(100, 100);
        //显示
        this.setVisible(true);
        //当关闭窗口时，保证jvm也退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
