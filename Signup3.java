package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
   JButton b1,b2;
   ButtonGroup bg1;
   String formno ;
   JRadioButton r1,r2,r3,r4;
   JCheckBox c1,c2,c3,c4,c5,c7,c6;

    Signup3(String formno){
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,0,100,100);
        add(image);

       //  this.formno = formno;
       JLabel label1 = new JLabel("Page 2:");
        label1.setBounds(300,2,100,100);
        label1.setFont(new Font("Ralway",Font.BOLD,25));
        add(label1);

        JLabel label2 = new JLabel("ACCOUNT DETAILS");
        label2.setBounds(300,40,800,100);
        label2.setFont(new Font("Ralway",Font.BOLD,25));
        add(label2);


        JLabel label3 = new JLabel("Account Type :");
        label3.setBounds(100,100,500,100);
        label3.setFont(new Font("Ralway",Font.BOLD,20));
        add(label3);

         r1 = new JRadioButton("Saving");
        r1.setBounds(100,190,200,20);
        r1.setFont(new Font("Ralway",Font.BOLD,15));
        r1.setBackground(new Color(184, 236, 228));
        add(r1);

        r2 = new JRadioButton("Current");
        r2.setBounds(100,230,200,20);
        r2.setFont(new Font("Ralway",Font.BOLD,15));
        r2.setBackground(new Color(184, 236, 228));
        add(r2);

       r3 = new JRadioButton("Fixed Deposit Account");
        r3.setBounds(350,190,500,20);
        r3.setFont(new Font("Ralway",Font.BOLD,15));
        r3.setBackground(new Color(184, 236, 228));
        add(r3);
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(350,230,500,20);
        r4.setFont(new Font("Ralway",Font.BOLD,15));
        r4.setBackground(new Color(184, 236, 228));
        add(r4);


       bg1 = new ButtonGroup();
       bg1.add(r1);
       bg1.add(r2);
       bg1.add(r3);
       bg1.add(r4);












        JLabel label4 = new JLabel("Card Number :");
        label4.setBounds(100,260,500,100);
        label4.setFont(new Font("Ralway",Font.BOLD,20));
        add(label4);


        JLabel label5 = new JLabel("XXXX-XXXX-XXXX-4184");
        label5.setBounds(300,260,500,100);
        label5.setFont(new Font("Ralway",Font.BOLD,20));
        add(label5);

        JLabel label7 = new JLabel("PIN :");
        label7.setBounds(100,340,500,100);
        label7.setFont(new Font("Ralway",Font.BOLD,20));
        add(label7);

        JLabel label8= new JLabel("XXXX");
        label8.setBounds(300,340,500,100);
        label8.setFont(new Font("Ralway",Font.BOLD,20));
        add(label8);


        JLabel label6 = new JLabel("Services Required :");
        label6.setBounds(100,420,500,100);
        label6.setFont(new Font("Ralway",Font.BOLD,20));
        add(label6);

       c1 = new JCheckBox("ATM Card");
       c1.setBounds(100,500,200,50);
       c1.setFont(new Font("Ralway",Font.BOLD,15));
       c1.setBackground(new Color(184, 236, 228));
       add(c1);

      c2 = new JCheckBox("Mobile Banking");
       c2.setBounds(100,550,200,50);
       c2.setFont(new Font("Ralway",Font.BOLD,15));
       c2.setBackground(new Color(184, 236, 228));
       add(c2);

         c3= new JCheckBox("Cheque Book");
        c3.setBounds(100,600,200,50);
        c3.setFont(new Font("Ralway",Font.BOLD,15));
        c3.setBackground(new Color(184, 236, 228));
        add(c3);


       c4 = new JCheckBox("Internet Banking");
       c4.setBounds(400,550,200,50);
       c4.setFont(new Font("Ralway",Font.BOLD,15));
       c4.setBackground(new Color(184, 236, 228));
       add(c4);
      c5 = new JCheckBox("Email ALerts");
       c5.setBounds(400,600,200,50);
       c5.setFont(new Font("Ralway",Font.BOLD,15));
       c5.setBackground(new Color(184, 236, 228));
       add(c5);

       c6= new JCheckBox("E-Statement");
       c6.setBounds(400,500,200,50);
       c6.setFont(new Font("Ralway",Font.BOLD,15));
       c6.setBackground(new Color(184, 236, 228));
       add(c6);


        c7 = new JCheckBox("I hereby declare that the above entered details correct to the best of my knowledge. ");
       c7.setBounds(100,650,800,50);
       c7.setFont(new Font("Ralway",Font.BOLD,10));
       c7.setBackground(new Color(184, 236, 228));
       add(c7);


        JLabel label13 = new JLabel("Form No:");
        label13.setBounds(600,0 ,800,100);
        label13.setFont(new Font("Ralway",Font.BOLD,15));
        label13.setForeground(Color.BLACK);
        add(label13);

        JLabel label14 = new JLabel(formno);
        label14.setBounds(660,0 ,800,100);
        label14.setFont(new Font("Ralway",Font.BOLD,15));
        label14.setForeground(Color.BLACK);
        add(label14);

         b1 = new JButton("Submit");
        b1.setBounds(150,710,100,20);
        b1.setFont(new Font("Ralway",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color. white);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Cancel");
        b2.setBounds(500,710,100,20);
        b2.setFont(new Font("Ralway",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);













        setLayout(null);
        setSize(850,750);
        setLocation(750,80);
        setBounds(300,15,800,900);
        getContentPane().setBackground(	new Color(184, 236, 228));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accounttype = null;
        if(r1.isSelected()){
            accounttype = "Saving Account";
        }
        else if(r2.isSelected()) {
            accounttype = "Current Account";
        } else if(r3.isSelected()){
            accounttype = "Fixed Deposit";
        }
        else if(r4.isSelected()){
            accounttype = "Reccuring Deposit";

        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String card_no = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

            String services = "";
            if(c1.isSelected())
            {services =services+"ATM Card";}
            else if(c2.isSelected())
            {services = services + "Mobile Banking";}
            else if(c3.isSelected()){
                services = services+"Cheque Book";
            }
            else if(c4.isSelected()){
                services = services+"Internet Banking";
            }
            else if(c5.isSelected()){
                services = services+"Email ALerts";
            }
            else if(c6.isSelected()){
                services = services + "E-Statementt";
            }

            try{
                if(e.getSource()==b1){
                    if(accounttype.equals("")){
                        JOptionPane.showMessageDialog(null,"Fill the fields");
                    }
                    else{
                        con n1 = new con();
                        String q = "insert into signup3 values ('"+formno+"','"+accounttype+"' , '"+card_no+"' , '"+pin+"' , '"+services+"')";
                        String p = "insert into login values ('"+formno+"' , '"+card_no+"' , '"+pin+"' )";
                        n1.statement.executeUpdate(q);
                        n1.statement.executeUpdate(p);
                        JOptionPane.showMessageDialog(null,"Card No :"  + card_no + " \n PIN :" + pin);
                        new main_Class(pin);
                        setVisible(false);
                    }
                }
                else if(e.getSource()==b2){
                    System.exit(0);
                }
            }
            catch (Exception E){
                E.printStackTrace();
            }






        
    }

    public static void main(String[] args) {
         new Signup3("");
    }
}
