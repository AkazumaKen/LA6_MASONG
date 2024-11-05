package FoodOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food extends JFrame{
    private JPanel pMain;
    private JCheckBox cbPizza;
    private JCheckBox cbSundae;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbTea;
    private JCheckBox cbSoftDrinks;
    private JRadioButton btNone;
    private JRadioButton bt5;
    private JRadioButton bt10;
    private JRadioButton bt15;
    private JButton btOrder;


    Food(){
        double[] ords = new double[6];
        JCheckBox[] checkbox = {cbPizza,cbBurger,cbFries,cbSoftDrinks,cbTea,cbSundae};
        double[] orders = {100, 80, 65, 55, 50, 40};

        btOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for(int i =0; i < checkbox.length; i++){
                    if(checkbox[i].isSelected()){
                        ords[i] = orders[i];
                    }


                }

                double discount = 0;
                if(btNone.isSelected()){
                    discount = 0;
                }

                if(bt5.isSelected()){
                    discount = 0.05;
                }

                if(bt10.isSelected()){
                    discount = 0.10;
                }

                if(bt15.isSelected()){
                    discount = 0.15;
                }


                double total = 0;
                for(double ord : ords){
                    total += ord;
                }

                double dis = total*(1-discount);


                JOptionPane.showMessageDialog(null,dis);

            }
        });// end sa action listener




    }

    public static void main(String[] args) {
        Food app = new Food();
        app.setContentPane(app.pMain);
        app.setSize(600,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setLocationRelativeTo(null);
        app.setResizable(false);
        app.setVisible(true);

    }


}
