package Thursday_7_19;

import javax.swing.*;

public class Demo9 extends JFrame {
    //定义组件
    JSplitPane jSplitPane;
    JList jst;
    JLabel jl;

    public static void main(String[] args) {
        Demo9 d9 = new Demo9();
    }

    public Demo9() {
        //创建组件
        String[] words = {"boy", "girl", "bird"};
        jst = new JList(words);
        jl = new JLabel(new ImageIcon("images/right_bg.jpg"));

        //拆分窗格
        jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jst, jl);

        //设置布局管理器

        //添加组件
        this.add(jSplitPane);

        //设置窗口属性
        this.setLocation(300, 300);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
