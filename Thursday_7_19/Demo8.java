/**
 * JComboBox/JList/
 */
package Thursday_7_19;

import javax.swing.*;
import java.awt.*;

public class Demo8 extends JFrame {
    //定义组件
    JPanel jp1, jp2;
    JLabel jl1, jl2;
    JComboBox jcb1 ;
    JList jlist;
    JScrollPane jsp;
    public static void main(String[] args) {
        Demo8 d8 = new Demo8();

    }

    public Demo8() {

        //创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();
        jl1 = new JLabel("你的籍贯");
        jl2 = new JLabel("旅游地点");

        String[] jg = {"北京", "上海", "天津", "火星"};
        jcb1 = new JComboBox(jg);
        String[] dd = {"九寨沟", "故宫", "天安门", "长城"};
        jlist = new JList(dd);
        jsp = new JScrollPane(jlist);
        jlist.setVisibleRowCount(2);
        //设置布局管理器
        this.setLayout(new GridLayout(2, 1));

        //添加组件
        jp1.add(jl1);
        jp1.add(jcb1);
        jp2.add(jl2);
        jp2.add(jsp);
        //jp2.add(jlist)是错误的

        this.add(jp1);
        this.add(jp2);

        //设置窗口属性
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
