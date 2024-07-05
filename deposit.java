package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {
    String pin;
    JTextField amount;
    JButton b1 ,b2;


     deposit(String pin){
         this.pin = pin;
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
         Image i2 =  i1.getImage().getScaledInstance(1550, 860, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel IMAGE = new JLabel(i3);
         IMAGE.setBounds(0,0,1500,860);
         add(IMAGE);

         JLabel label = new JLabel("Enter Amount You Want To Deposit");
         label.setFont(new Font("Tahoma", Font.BOLD, 20));
         label.setBounds(420,200,500,50);
         label.setForeground(Color.WHITE);
         IMAGE.add(label);

         amount = new JTextField(18);
         amount.setBounds(420,250,350,25);
         amount.setFont(new Font("Tahoma", Font.BOLD, 15));
         amount.setForeground(Color.BLACK);
         amount.setBackground(new Color(63, 149, 127));
         amount.setEditable(true);
         IMAGE.add(amount);

         b1 = new JButton("DEPOSIT");
         b1.setFont(new Font("Tahoma", Font.BOLD, 15));
         b1.setForeground(Color.WHITE);
         b1.setBounds(650,330,150,30);
         b1.setBackground(new Color(63, 149, 127));
         b1.addActionListener(this);
         IMAGE.add(b1);

         b2 = new JButton("BACK");
         b2.setFont(new Font("Tahoma", Font.BOLD, 15));
         b2.setForeground(Color.WHITE);
         b2.setBounds(650,370,150,30);
         b2.setBackground(new Color(63, 149, 127));
         b2.addActionListener(this);
         IMAGE.add(b2);




























         setLayout(null);
         setSize(1550,1080);
         setLocation(0,0);
         setVisible(true);

     }
     public void actionPerformed(ActionEvent e) {
        try{ String Amount = amount.getText();
        Date date = new Date();
        if(e.getSource()==b1){
            if(amount.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter the Amount For Deposit");
            }
            else{
                con w1 = new con();
                w1.statement.executeUpdate("insert into bank values('"+pin+"' , '"+date+"','Deposit', '"+Amount+"')");
                JOptionPane.showMessageDialog(null,"Rs "+Amount+" Deposited");
                setVisible(false);
                new main_Class(pin);
            }

        }
        else if(e.getSource()==b2){
            setVisible(false);
            new main_Class(pin);
        }

        }
        catch (Exception E){
            E.printStackTrace();
        }
     }
    public static void main(String[] args) {
     new deposit("");
    }
}
