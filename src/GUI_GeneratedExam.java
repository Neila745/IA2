import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class GUI_GeneratedExam extends JFrame implements ActionListener {

    private JFrame frame;
    private JLabel paper;
    private JButton generateExam;
    private JTextArea textArea;
    private QuestionSet questions;


    public GUI_GeneratedExam(int width, int height, QuestionSet questions) {
        this.questions = questions;
        // initialise the window
        frame = new JFrame("userPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 600);
        frame.setLayout(null);
        paper = new JLabel("Exam");
        paper.setBounds(10, 10, 400, 40);
        //frame.getContentPane().add(paper);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        generateExam = new JButton("Generate Exam");
        generateExam.setBounds(0, 10, 400, 40);
        generateExam.addActionListener(this);
        frame.getContentPane().add(generateExam);
        frame.setVisible(true);

    }

    private void displayDatabase(){
            textArea = new JTextArea(questions.display());
            textArea.setBounds(400,200, 300,300);
            frame.getContentPane().add(textArea);
            textArea.requestFocus();
            frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Generate Exam")) {
            displayDatabase();
        }
    }
}
