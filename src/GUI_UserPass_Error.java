import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI_UserPass_Error extends JFrame implements ActionListener {
    // Declaration of object of JButton class.
    private JFrame frame;
    private JButton button1;
    private JLabel label;


    // Constructor of Demo class
    GUI_UserPass_Error() {
        frame = new JFrame("error");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 600);
        frame.setLayout(null);

        // Initialization of object of "JButton" class.
        button1 = new JButton("Done");
        button1.setBounds(10, 100, 90, 40);
        this.add(button1);
        button1.addActionListener(this);
        frame.getContentPane().add(button1);
        label = new JLabel("Wrong Login Details");
        label.setBounds(10, 10, 400, 100);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Done")) {
            GUI_userPass up = new GUI_userPass();
        }
    }
}