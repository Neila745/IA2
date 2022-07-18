import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.*;
import java.util.ArrayList;

public class GUI_Database extends JFrame implements ActionListener {
    private JFrame frame;
    private JTextField questionText;
    private JLabel questionLabel;
    private JTextField marksText;
    private JLabel marksLabel;
    private JTextField topicText;
    private JLabel topicLabel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button5;
    private JButton Buttonf;
    private JButton Buttonh;
    private JTextArea JTextArea1;


    public GUI_Database(int width, int height) {
        frame = new JFrame("userPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 600);
        frame.setLayout(null);

        questionLabel = new JLabel("Please Enter The Question:");
        questionLabel.setBounds(10, 50, 400, 40);
        frame.getContentPane().add(questionLabel);
        questionText = new JTextField();
        questionText.setBounds(10, 90, 266, 40);
        questionText.addActionListener(this);
        frame.getContentPane().add(questionText);
        marksLabel = new JLabel("Please Enter The Marks:");
        marksLabel.setBounds(10, 130, 266, 40);
        frame.getContentPane().add(marksLabel);
        marksText = new JTextField();
        marksText.setBounds(10, 170, 266, 40);
        marksText.addActionListener(this);
        frame.getContentPane().add(marksText);
        topicLabel = new JLabel("Please Enter The Topic:");
        topicLabel.setBounds(10, 210, 266, 40);
        frame.getContentPane().add(topicLabel);
        topicText = new JTextField();
        topicText.setBounds(10, 250, 266, 40);
        topicText.addActionListener(this);
        frame.getContentPane().add(topicText);

        button1 = new JButton("Enter");
        button1.setBounds(10, 330, 100, 40);
        button1.addActionListener(this);
        frame.getContentPane().add(button1);
        Buttonf = new JButton("DATA");
        Buttonf.setBounds(10, 500, 100, 40);
        Buttonf.addActionListener(this);
        frame.getContentPane().add(Buttonf);
        Buttonh = new JButton("DATA2");
        Buttonh.setBounds(10, 400, 100, 40);
        Buttonh.addActionListener(this);
        frame.getContentPane().add(Buttonh);
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
        JTextArea1 = new JTextArea("text");
        JTextArea1.setBounds(400, 50, 400, 500);
        frame.getContentPane().add(JTextArea1);
        frame.setVisible(true);

    }




    public void questions() {

        Question q = new Question((Integer.parseInt(marksText.getText())), questionText.getText(), topicText.getText());
        String topic = q.getTopic();
        String data = q.getText();
        int marks = Integer.parseInt(String.valueOf(q.getMarks()));
        Database db = new Database("input.txt", 100);
        //db.addRecord(topic, data, marks);//TODO: WHY WONT PRINT ON NEW LINE
    }
    private void displayDatabase(String filename) throws IOException {
        //TODO: //filehandling in GUI?    //only appears why button is pressed?
        try
        {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            JTextArea1.read(br, "jTextArea");
            br = new BufferedReader(new FileReader(String.valueOf(fr)));
            System.out.println(br.readLine());
            br.close();
            JTextArea1.requestFocus();
        }catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
/*String filename="input.txt";
            try {
        FileReader reader = new FileReader(filename);
        BufferedReader br = new BufferedReader(reader);
        JTextArea1.read(br, null);
        br.close();
        JTextArea1.requestFocus();
    } catch (FileNotFoundException fileNotFoundException) {
        fileNotFoundException.printStackTrace();
    } catch (IOException ioException) {
        ioException.printStackTrace();
    }*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Enter")) {
            questions();

        }else if (e.getActionCommand().equals("Close")) {
            questionText.setText("");
            marksText.setText("");
            topicText.setText("");
        }else if (e.getActionCommand().equals("DATA")){
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename=f.getAbsolutePath();
            try {
                FileReader reader = new FileReader(filename);
                BufferedReader br = new BufferedReader(reader);
                JTextArea1.read(br, null);
                br.close();
                JTextArea1.requestFocus();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (e.getActionCommand().equals("DATA2")){
            try {
                displayDatabase("input.txt");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("Home Page")) {
            GUI_test gt = new GUI_test(400, 400);
        }else if (e.getActionCommand().equals("Database")) {
            GUI_Database db = new GUI_Database(400, 400);
        }
    }
}
