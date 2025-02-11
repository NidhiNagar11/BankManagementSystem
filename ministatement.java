package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ministatement extends JFrame implements ActionListener {
    String pin;
    JButton button1;
    ministatement(String pin){
        this.pin = pin;
        getContentPane().setBackground(new Color(255,204,204));
        setLayout(null);
        setSize(400,600);
        setLocation(20,20);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,200);
        label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.BLACK);
        add(label1);

        JLabel label2 = new JLabel("Mini Statement");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        label2.setBounds(150,20,200,20);
        add(label2);


        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try{
            con v = new con();
            ResultSet resultSet =  v.statement.executeQuery("select * from login where pin='"+pin+"'");
          while(resultSet.next()){
              label3.setText("Card Number: "+resultSet.getString("card_no" ).substring(0,4) + "XXXXXXXX"+ resultSet.getString("card_no").substring(12));
          }
        }
        catch(Exception e){
            e.printStackTrace();
        }


        try{
            int balance =0;
            con i = new con();
            ResultSet resultSet = i.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(resultSet.next()){
              label1.setText(label1.getText() + "<html>"+ resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;" +resultSet.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;" +" "+resultSet.getString("amount")+"<br><br><html>");
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

            label4.setText("Your Balance: "+balance);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        button1 = new JButton("Back");
        button1.setBounds(20,500,100,25);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);
        add(button1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    setVisible(false);
    }

    public static void main(String[] args) {
        new ministatement("");
    }
}
