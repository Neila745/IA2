import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// Declaration of object of JButton class.

class GUI_Error_Database extends JFrame implements ActionListener {
    private JFrame frame;
    private JButton button1;
    private JLabel label;


    // Constructor of Demo class
    GUI_Error_Database() {
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
        label = new JLabel("Question Already exists");
        label.setBounds(10, 10, 400, 100);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Done")) {
            GUI_Database db = new GUI_Database(400, 400);
        }
    }
}