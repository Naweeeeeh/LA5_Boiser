package FoodOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                JCheckBox[] cbFoods = {cPizza, cBurger, cFries,cSoftDrinks,cTea,cSundae};
                JRadioButton[] rbDiscounts = {rbNone,rb5,rb10,rb15};
                float totalAmount = 0;

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
