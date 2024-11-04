package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends  JFrame{
    private JTextField yearTextField;
    private JPanel pMain;
    private JButton checkYearButton;

    LeapYearChecker(){
        yearTextField.setName("yearTextField");
        checkYearButton.setName("checkYearButton");

        checkYearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTextField.getText());
                if(((year % 4 == 0) && (year % 100!= 0)) || (year% 400 == 0)){
                    JOptionPane.showMessageDialog(null, "Leap year");
                }else{
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker s = new LeapYearChecker();
        s.setTitle("Leap Year Checker");
        s.setContentPane(s.pMain);
        s.setSize(500, 500);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
    }
}
