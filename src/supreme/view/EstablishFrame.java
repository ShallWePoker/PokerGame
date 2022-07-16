package supreme.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstablishFrame extends JFrame {
    private JPanel contentPane;
    public EstablishFrame()
    {
        setTitle("创建房间");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(0,0,300,400);
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        JLabel text = new JLabel("房间密码");
        text.setFont(new Font("微软雅黑", Font.BOLD, 14));
        text.setBounds(40,80,100,40);
        contentPane.add(text);

        JTextField jTextField = new JTextField();
        jTextField.setFont(new Font("微软雅黑", Font.BOLD, 14));
        jTextField.setBounds(100,90,100,25);
        contentPane.add(jTextField);

        JButton btnestbilish = new JButton("创建");
        btnestbilish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                establishButton(e);

            }
        });
        btnestbilish.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnestbilish.setBounds(100,250,80,30);
        contentPane.add(btnestbilish);

        JButton btnreturn = new JButton("返回");
        btnreturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnButton(e);

            }
        });
        btnreturn.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnreturn.setBounds(100,300,80,30);
        contentPane.add(btnreturn);

        btnreturn.setFocusable(false);
        btnreturn.setFocusable(false);

    }

    //创建按钮
    private void establishButton(ActionEvent e) {
        TableFrame tableFrame = new TableFrame();
        tableFrame.setVisible(true);
        this.setVisible(false);
    }

    //返回按钮
    private void returnButton(ActionEvent e) {
        this.setVisible(false);
    }

}
