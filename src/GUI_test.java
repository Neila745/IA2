import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// provides a way to create new graph pop-ups
public class GUI_test extends JFrame implements ActionListener {

    private JFrame frame;
    private JLabel title;
    private JTextField entertopic;
    private JTextField minMarks;
    private JTextField maxMarks;
    private JLabel topicTitle;
    private JLabel minTitle;
    private JLabel maxTitle;
    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;


    public GUI_test(int width, int height) {
        frame = new JFrame("userPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 600);
        frame.setLayout(null);

        title = new JLabel("Computer Science Questions");
        title.setBounds(10, 50, 400, 40);
        frame.getContentPane().add(title);
        topicTitle = new JLabel("Enter topic:");
        topicTitle.setBounds(10, 90, 400, 40);
        frame.getContentPane().add(topicTitle);
        entertopic = new JTextField();
        entertopic.setBounds(10, 130, 400, 40);
        frame.getContentPane().add(entertopic);
        minTitle = new JLabel("Enter minimum marks");
        minTitle.setBounds(10, 170, 400, 40);
        frame.getContentPane().add(minTitle);
        minMarks = new JTextField();
        minMarks.setBounds(10, 210, 400, 40);
        frame.getContentPane().add(minMarks);
        maxTitle = new JLabel("Enter maximum marks");
        maxTitle.setBounds(10, 250, 400, 40);
        frame.getContentPane().add(maxTitle);
        maxMarks = new JTextField();
        maxMarks.setBounds(10, 290, 400, 40);
        frame.getContentPane().add(maxMarks);

        button = new JButton("Enter");
        button.setBounds(10, 330, 100, 40);
        button.addActionListener(this);
        frame.getContentPane().add(button);
        button2 = new JButton("Close");
        button2.setBounds(150, 330, 100, 40);
        button2.addActionListener(this);
        frame.getContentPane().add(button2);
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

    public QuestionSet testMethod() {
        Database myDatabase = new Database("input.txt", 100);
        //Grouping g = new Grouping();
        String topic = entertopic.getText();
        int minMark = Integer.parseInt(minMarks.getText());
        int maxMark = Integer.parseInt(maxMarks.getText());
        QuestionSet testSet = new QuestionSet(myDatabase, topic, minMark, maxMark);

        return testSet;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Enter")) {
            testMethod();
            GUI_GeneratedExam GE = new GUI_GeneratedExam(400, 400, testMethod());

        } else if (e.getActionCommand().equals("Close")) {
            minMarks.setText("");
            maxMarks.setText("");
            entertopic.setText("");
        } else if (e.getActionCommand().equals("Home Page")) {
            GUI_test gt = new GUI_test(400, 400);
        }else if (e.getActionCommand().equals("Database")) {
            GUI_Database db = new GUI_Database(400, 400);
        }

    }
}
