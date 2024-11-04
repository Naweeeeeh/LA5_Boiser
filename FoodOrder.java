package FoodOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FoodOrder extends JFrame{
    private JPanel pMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    FoodOrder(){
        cPizza.setName("cPizza");
        cBurger.setName("cBurger");
        cFries.setName("cFries");
        cSoftDrinks.setName("cSoftDrinks");
        cTea.setName("cTea");
        cSundae.setName("cSundae");
        rbNone.setName("rbNone");
        rb5.setName("rb5");
        rb10.setName("rb10");
        rb15.setName("rb15");
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalAmount = 0;
                if(cPizza.isSelected()){
                    totalAmount += 100;
                }
                if(cBurger.isSelected()){
                    totalAmount += 80;
                }
                if(cFries.isSelected()){
                    totalAmount += 65;
                }
                if(cSoftDrinks.isSelected()){
                    totalAmount += 55;
                }
                if(cTea.isSelected()){
                    totalAmount += 50;
                }
                if(cSundae.isSelected()){
                    totalAmount += 40;
                }
                if(rbNone.isSelected()){
                    totalAmount -= (totalAmount * 0);
                }
                if(rb5.isSelected()){
                    totalAmount -= (totalAmount * 0.05);
                }
                if(rb10.isSelected()){
                    totalAmount -= (totalAmount * 0.1);
                }
                if(rb15.isSelected()){
                    totalAmount -= (totalAmount * 0.15);
                }
                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", totalAmount));

            }
        });
    }
    public static void main(String[] args) {
        FoodOrder s = new FoodOrder();
        s.setTitle("Food Ordering System");
        s.setContentPane(s.pMain);
        s.setSize(600, 600);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
    }
}