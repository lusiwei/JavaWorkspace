/**
 * java绘图原理
 */
package Friday_7_20;

import javax.swing.*;
import java.awt.*;

public class Demo9_1 extends JFrame {
    //定义
    MyPanle mp = null;
    public static void main(String[] args) {
        Demo9_1 d91 = new Demo9_1();
    }

    public Demo9_1() {
        mp = new MyPanle();
        this.add(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}


//定义一个MyPanel我自己的面板，是用于绘图和实现绘图的区域
class MyPanle extends JPanel {

    //覆盖JPanel的paint方法
    //Graphics是绘图的重要类，你可以把它理解为一只画笔
    public void paint(Graphics g) {
        //调用父类函数完成初始化
        //这句话不能少
        super.paint(g);
        System.out.println("paint被调用");
        //先画一个圆
        g.drawOval(10, 10, 30, 30);
        //画出直线
        g.drawLine(10, 10, 20, 30);
        //画矩形边框
        g.drawRect(100, 100, 20, 20);
        //画填充矩形
        //设置颜色
        g.setColor(Color.blue);
        g.fillRect(10, 10, 40, 40);
        g.setColor(Color.red);
        g.fillRect(70, 70, 40, 60);

        //在面板上画图片

        Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/images/1.gif"));
        g.drawImage(im, 90, 90, 200, 150, this);
        //如何画出汉字
        g.setColor(Color.blue);
        g.setFont(new Font("华文彩云", Font.BOLD, 50));
        g.drawString("hello world", 100, 100);
    }
}
