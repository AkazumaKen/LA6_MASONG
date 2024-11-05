package LEAPYEARCHECKER;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LEAPYEAR extends JFrame{
    private JTextField txField;
    private JPanel pMain;
    private JButton btCheek;


    LEAPYEAR(){
        btCheek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int year = Integer.parseInt(txField.getText());

            if(isLeapYear(year) == true){
                    JOptionPane.showMessageDialog(null,"Is Leap Year");
                }else{

                JOptionPane.showMessageDialog(null,"Not a leapyear");
            }

            }
        });
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        LEAPYEAR app = new LEAPYEAR();
        app.setContentPane(app.pMain);
        app.setSize(300,200);
        app.setTitle("Leap Year Checker");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
        app.setVisible(true);

    }

}
