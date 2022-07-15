import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GUI_GeneratedExam {

    private JFrame frame;
    private JLabel paper;
    private JButton generateExam;
    private JTextArea textArea;


    public GUI_GeneratedExam(int width, int height, QuestionSet questions) {
        // initialise the window
        frame = new JFrame("userPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 600);
        frame.setLayout(null);
        paper = new JLabel("Exam");
        paper.setBounds(10, 10, 400, 40);
        frame.getContentPane().add(paper);
        QuestionSet qs = new QuestionSet();

        List<Object> objects2 = Arrays.asList(getArray());
        ArrayList<QuestionSet> arrayList = new ArrayList<QuestionSet>(Collections.singleton(gt.testMethod()));
        String[] str = new String[arrayList.size()];
        JList<String> list = new JList<>(arrayList.toArray(str));
        list.setBounds(100,100, 75,75);
        JScrollPane scrollPane = new JScrollPane(list);
        frame.getContentPane().add(scrollPane);

        //frame.getContentPane().add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
