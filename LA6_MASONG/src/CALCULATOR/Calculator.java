package CALCULATOR;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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
                 int Total = Integer.parseInt(tfOne.getText()) + Integer.parseInt(tfTwo.getText());
                 tfRes.setText(String.valueOf(Total));
                }

                if("-" == cbOpe.getSelectedItem()){
                    int Total = Integer.parseInt(tfOne.getText()) - Integer.parseInt(tfTwo.getText());
                    tfRes.setText(String.valueOf(Total));
                }

                if("*" == cbOpe.getSelectedItem()){
                    int Total = Integer.parseInt(tfOne.getText()) * Integer.parseInt(tfTwo.getText());
                    tfRes.setText(String.valueOf(Total));
                }
                try{
                if("/" == cbOpe.getSelectedItem()){
                    int Total = Integer.parseInt(tfOne.getText()) / Integer.parseInt(tfTwo.getText());
                    tfRes.setText(String.valueOf(Total));

                }
                }catch (ArithmeticException i){
                    JOptionPane.showMessageDialog(null,"HALA DLI PWEDI ANG n e divide sa 0!");
                }



            }
        });

   }



    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.pCalc);
        app.setSize(600,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");

        app.setResizable(false);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }

};
