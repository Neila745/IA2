import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_GeneratedExam extends JFrame implements ActionListener {

    private JFrame frame;
    private JLabel paper;
    private JButton generateExam;
    private JButton button3;
    private JButton button5;
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
        generateExam.setBounds(150, 450, 400, 40);
        generateExam.addActionListener(this);
        frame.getContentPane().add(generateExam);
        textArea = new JTextArea();
        textArea.setBounds(200,100, 300,300);
        frame.getContentPane().add(textArea);
        button3 = new JButton("Home Page");
        button3.setBounds(0, 10, 400, 40);
        button3.addActionListener(this);
        frame.getContentPane().add(button3);
        button5 = new JButton("Database");
        button5.setBounds(400, 10, 400, 40);
        button5.addActionListener(this);
        frame.getContentPane().add(button5);
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
        } else if (e.getActionCommand().equals("Home Page")) {
            GUI_test gt = new GUI_test(400, 400);
        }else if (e.getActionCommand().equals("Database")) {
            GUI_Database db = new GUI_Database(400, 400);
        }
    }
}
