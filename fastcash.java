package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastcash extends JFrame implements ActionListener {
    String  pin;
    JButton button1,button2,button3,button4,button5,button6,button7;
    fastcash(String pin)
    { this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,860, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,860);
        add(l1);
        JLabel label = new JLabel("Select Withdrawl Amount");
        label.setFont(new Font("Tahoma", Font.BOLD, 25));
        label.setBounds(420,200,550,50);
        label.setForeground(Color.WHITE);
        l1.add(label);

        button1 = new JButton("Rs. 100");
        button1.setFont(new Font("Tahoma", Font.BOLD, 17));
        button1.setBounds(420,285,150,25);
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(63, 149, 127));
        button1.addActionListener(this);
        l1.add(button1);


        button2 = new JButton("Rs. 1000");
        button2.setFont(new Font("Tahoma", Font.BOLD, 17));
        button2.setBounds(420,330,150,25);
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(63, 149, 127));
        button2.addActionListener(this);
        l1.add(button2);

        button3 = new JButton("Rs. 5000");
        button3.setFont(new Font("Tahoma", Font.BOLD, 17));
        button3.setBounds(420,380,150,25);
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(63, 149, 127));
        button3.addActionListener(this);
        l1.add(button3);

        button4 = new JButton("Rs. 500");
        button4.setFont(new Font("Tahoma", Font.BOLD, 17));
        button4.setBounds(665,285,170,25);
        button4.setForeground(Color.WHITE);
        button4.setBackground(new Color(63, 149, 127));
        button4.addActionListener(this);
        l1.add(button4);

        button5 = new JButton("Rs. 2000");
        button5.setFont(new Font("Tahoma", Font.BOLD, 17));
        button5.setBounds(665,334,170,25);
        button5.setForeground(Color.WHITE);
        button5.setBackground(new Color(63, 149, 127));
        button5.addActionListener(this);
        l1.add(button5);

        button6 = new JButton("Rs. 10000");
        button6.setFont(new Font("Tahoma", Font.BOLD, 17));
        button6.setBounds(665,384,170,25);
        button6.setForeground(Color.WHITE);
        button6.setBackground(new Color(63, 149, 127));
        button6.addActionListener(this);
        l1.add(button6);

        button7 = new JButton("Back");
        button7.setFont(new Font("Tahoma", Font.BOLD, 17));
        button7.setBounds(665,430,170,25);
        button7.setForeground(Color.WHITE);
        button7.setBackground(new Color(63, 149, 127));
        button7.addActionListener(this);
        l1.add(button7);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button7) {
            setVisible(false);
            new main_Class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            con c = new con();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != button7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"', 'withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }


    }
    public static void main(String[] args) {
        new fastcash("");
    }
}
