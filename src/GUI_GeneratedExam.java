import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        generateExam = new JButton("Generate Exam");
        generateExam.setBounds(0, 10, 400, 40);
        generateExam.addActionListener(this);
        frame.getContentPane().add(generateExam);
        textArea = new JTextArea();
        textArea.setBounds(200,200, 300,300);
        frame.getContentPane().add(textArea);
        frame.setVisible(true);
    }

    private void displayDatabase(){
            textArea.setText(questions.getText());
            //frame.setVisible(true);
            //frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Generate Exam")) {
            displayDatabase();
        }
    }
}
