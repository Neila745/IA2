import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI_GeneratedExam {

    private JFrame frame;
    private JLabel paper;
    private JButton generateExam;
    private JTextArea textArea;
    private static ArrayList <Question> questions;


    public GUI_GeneratedExam(int width, int height, QuestionSet questions) {
        // initialise the window
        frame = new JFrame("userPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 600);
        frame.setLayout(null);
        paper = new JLabel("Exam");
        paper.setBounds(10, 10, 400, 40);
        //frame.getContentPane().add(paper);

        GUI_test gt = new GUI_test(400,400);
        TextField tf= new TextField(display());
        tf.setBounds(0,0, 700,400);

        frame.getContentPane().add(tf);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public String display() {
        String q = null;
        for (int i = 0; i < questions.size(); i++) {
            q = questions.get(i).getText();
        }
        return q;
    }
}
