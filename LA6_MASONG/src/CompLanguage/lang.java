package CompLanguage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class lang extends JFrame{
    private JPanel pMain;
    private JCheckBox cbC;
    private JCheckBox cbPhy;
    private JCheckBox cbJava;
    private JCheckBox cbCplus;
    private JCheckBox cbCsharp;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JTextArea textArea2;



    lang(){

        cbC = new JCheckBox("C");
        cbPhy = new JCheckBox("Python");
        cbJava = new JCheckBox("Java");
        cbCplus = new JCheckBox("C++");
        cbCsharp = new JCheckBox("C#");

        String[] prof = {"low","medium","high"};
        JComboBox<String> comboBox = new JComboBox<>(prof);



        textArea2.append("My Favorite Language: ");


        textArea1.append("Profeciency: ");
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBox.getSelectedIndex();
                String selectedValue = (String) comboBox.getSelectedItem();
                textArea1.append(selectedValue);

            }
        });




    }


    public static void main(String[] args) {

        lang app = new lang();
        app.setContentPane(app.pMain);
        app.setSize(300,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Item Listiner");
        app.setLocationRelativeTo(null);
        app.setResizable(false);
        app.setVisible(true);

    }

}
