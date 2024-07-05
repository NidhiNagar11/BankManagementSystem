package bank.management.system;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl  extends JFrame implements ActionListener {
    String pin;
    TextField textfield;
    JButton b1,b2;
    withdrawl(String pin){
        this.pin = pin; this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 =  i1.getImage().getScaledInstance(1550, 860, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMAGE = new JLabel(i3);
        IMAGE.setBounds(0,0,1500,860);
        add(IMAGE);

        JLabel label = new JLabel("Enter Amount You Want To Withdrawl");
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        label.setBounds(420,200,500,50);
        label.setForeground(Color.WHITE);
        IMAGE.add(label);

        textfield = new TextField(20);
        textfield.setBounds(420,250,355,25);
        textfield.setFont(new Font("Tahoma", Font.BOLD, 15));
        textfield.setForeground(Color.BLACK);
        textfield.setBackground(new Color(63, 149, 127));
        textfield.setEditable(true);
        IMAGE.add(textfield);

        b1 = new JButton("WITHDRAWL");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            String amount = textfield.getText();
            Date date = new Date();
        try{
            if(textfield.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Amount You Want To Withdrawl");
            }
            else{
                con con10 = new con();
                ResultSet resultSet = con10.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if (balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }
                con10.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                setVisible(false);
                new main_Class(pin);
            }

        }
        catch(Exception E)
        {
             E.printStackTrace();
        }
    }
        else if (e.getSource()==b2) {
        setVisible(false);
        new main_Class(pin);
    }
    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}