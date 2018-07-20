/**
 * 功能：坦克游戏1.0
 * 1.画出坦克
 */
package MyTankGame;

import javax.swing.*;
import java.awt.*;

public class MyTankGame1 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        MyTankGame1 myTankGame1 = new MyTankGame1();
    }

    public MyTankGame1() {
        mp = new MyPanel();
        this.add(mp);

        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

//我的面板
class MyPanel extends JPanel {
    //定义一个我的坦克
    Hero hero = null;
    //构造函数
    public MyPanel() {
        hero = new Hero(100,10);
    }

    //重新paint
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 400, 300);
        this.drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    //画坦克的函数
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //判断是什么类型的坦克
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        //判断方向
        switch (direct) {
            //向上
            case 0:
                //设置颜色
//                g.setColor(Color.CYAN);
                //画出我的坦克(到时再封装成函数）
                //1.画出左边的矩形
                g.fill3DRect(x,y,5,30,false);
                //2.画出右边矩形
                g.fill3DRect(x + 15, y, 5, 30, false);
                //3. 画出右边矩形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //画出圆形
                g.fillOval(x + 5, y + 10, 10, 10);
                //画出线
                g.drawLine(x+10,y,x + 10, y + 15);

        }
    }

}

//坦克类
class Tank {
    //表示坦克的横坐标
    int x = 0;
    //坦克的纵坐标
    int y = 0;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

//我的坦克
class Hero extends Tank {
    public Hero(int x, int y) {
        super(x, y);
    }
}

