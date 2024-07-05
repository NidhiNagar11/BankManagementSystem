
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4;
    JTextField textfield1;
    JPasswordField passwordField1;
    JButton button1,button2,button3,button4;
    Login(){
    super("Bank Management System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setFont(new Font("AvantGrade" , Font.BOLD,38));
        label1.setForeground(Color.white);
        label1.setBounds(250,125,450 ,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway" , Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,450 ,40);
        add(label2);

        textfield1 = new JTextField(10);
        textfield1.setFont(new Font("Arial" , Font.BOLD,14));
        textfield1.setForeground(Color.black);
        textfield1.setBounds(325,190 ,230,30);
        add(textfield1);

        label3 = new JLabel("PIN :");
        label3.setFont(new Font("Ralway" , Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,350 ,40);
        add(label3);

        passwordField1 = new JPasswordField(10 );
        passwordField1.setFont(new Font("Arial" , Font.BOLD,14));
        passwordField1.setForeground(Color.black);
        passwordField1.setBounds(325,250,230 ,30);
        add(passwordField1);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Ralway" , Font.BOLD,14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(325,290,100 ,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Ralway" , Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(450,290,100 ,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN OUT");
        button3.setFont(new Font("Ralway",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(325,330,230 ,25);
        button3.addActionListener(this);
        add(button3);











        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);



        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setUndecorated(true);



   setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        if (e.getSource()==button1){
            con j1 = new con();
            String cardno = textfield1.getText();
            String pin = passwordField1.getText();
           String q =  "select * from login where pin='"+pin+"' and card_no='"+cardno+"'";
            ResultSet resultset = j1.statement.executeQuery(q);
            if(resultset.next()){
                setVisible(false);
                new main_Class(pin);

            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Card Number and Pin");
            }
        } else if (e.getSource()==button2) {
          textfield1.setText("");
          passwordField1.setText("");
        }
        else if (e.getSource()==button3) {
         new signup();
         setVisible(false);
        }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
