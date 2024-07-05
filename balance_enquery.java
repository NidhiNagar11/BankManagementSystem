package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balance_enquery extends JFrame implements ActionListener {
    JButton b1 ;
    String pin;
    JLabel label;
    balance_enquery(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 =  i1.getImage().getScaledInstance(1550, 860, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMAGE = new JLabel(i3);
        IMAGE.setBounds(0,0,1500,860);
        add(IMAGE);

        JLabel label2 = new JLabel("Your Current  Account Balance is RS = ");
        label2.setBounds(420,159,500,50);
        label2.setFont(new Font("Tahoma", Font.BOLD, 20));
        label2.setForeground(Color.WHITE);
        IMAGE.add(label2);

        JLabel label = new JLabel();
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        label.setBounds(420,200,500,50);
        label.setForeground(Color.WHITE);
        IMAGE.add(label);





        b1 = new JButton("BACK");
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.setForeground(Color.WHITE);
        b1.setBounds(650,370,150,30);
        b1.setBackground(new Color(63, 149, 127));
        b1.addActionListener(this);
        IMAGE.add(b1);


        int balance =0;
        try{
            con conn = new con();
            ResultSet resultSet = conn.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while(resultSet.next()) {
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));

                }
                else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        label.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);

    }

    public static void main(String[] args) {
        new balance_enquery("");
    }
}
