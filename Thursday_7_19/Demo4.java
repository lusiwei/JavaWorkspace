package Thursday_7_19;

import javax.swing.*;
import java.awt.*;

/**
 * 网格布局
 */
public class Demo4 extends JFrame {
    //定义组件
    int size = 9;
    JButton jbs[] = new JButton[size];

    public static void main(String[] args) {
        Demo4 d4 = new Demo4();
    }

    public Demo4() {
        //创建组件
        for (int i = 0; i < size; i++) {
            jbs[i] = new JButton(String.valueOf(i));
        }
        //添加组件
        for (int i = 0; i < size; i++) {
            this.add(jbs[i]);
        }
        //设置网格布局
        this.setLayout(new GridLayout(3, 3));
        //设置窗体属性
        this.setTitle("网格布局案例");
        this.setSize(300, 200);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗体
        this.setVisible(true);
    }

}
