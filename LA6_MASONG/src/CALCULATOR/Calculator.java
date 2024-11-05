package CALCULATOR;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel pCalc;
    private JTextField tfOne;
    private JComboBox cbOpe;
    private JTextField tfTwo;
    private JTextField tfRes;
    private JButton btCompute;


    Calculator(){

        btCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             if("+" == cbOpe.getSelectedItem()){
                 int Total = Integer.parseInt(tfOne.getText() + tfTwo.getText());
                 tfRes.setText(String.valueOf(Total));
             }

                if("/" == cbOpe.getSelectedItem()){
                    int Total = Integer.parseInt(tfOne.getText() / tfTwo.getText());
                    tfRes.setText(String.valueOf(Total));
                }

                if("-" == cbOpe.getSelectedItem()){
                    int Total = Integer.parseInt(tfOne.getText() - tfTwo.getText());
                    tfRes.setText(String.valueOf(Total));
                }

                if("*" == cbOpe.getSelectedItem()){
                    int Total = Integer.parseInt(tfTwo.getText() * tfOne.getText());
                    tfRes.setText(String.valueOf(Total));
                }


            }
        });

   }



    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.pCalc);
        app.setSize(600,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("CALCULATOR");
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }

};
