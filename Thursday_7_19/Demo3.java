/**
 * 功能：流式布局
 */
package Thursday_7_19;

import javax.swing.*;
import java.awt.*;

public class Demo3 extends JFrame {

    //定义所需要的组件
    JButton jb1, jb2, jb3, jb4, jb5, jb6;

    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
    }

    public Demo3() {
        //创建组件
        jb1 = new JButton("关羽");
        jb2 = new JButton("张飞");
        jb3 = new JButton("马超");
        jb4 = new JButton("赵云");
        jb5 = new JButton("黄忠");
        jb6 = new JButton("魏延");
        //添加组件
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jb5);
        this.add(jb6);
        //设置布局管理器
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        //设置窗体属性
        this.setTitle("demo3");
        this.setSize(300, 200);
        this.setLocation(100, 100);
        //禁止用户改变窗体大小
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
