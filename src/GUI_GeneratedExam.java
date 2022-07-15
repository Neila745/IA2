import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class GUI_GeneratedExam implements ActionListener{

    private JFrame frame;
    private JLabel paper;
    private JButton generateExam;
    private JTextArea textArea;


    public GUI_GeneratedExam(int width, int height) {
        // initialise the window
        frame = new JFrame("userPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0, 800, 600);
        frame.setLayout(null);
        paper = new JLabel ("Exam");
        paper.setBounds(10, 10, 400, 40);
        frame.getContentPane().add(paper);

        textArea = new JTextArea();
        textArea.setBounds(50,50,600,400);
        frame.add(QuestionSet.display());
        frame.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Generated Exam")) {

        }
    }


}
