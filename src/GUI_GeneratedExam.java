import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GUI_GeneratedExam implements ActionListener{

    private JFrame frame;
    private JLabel paper;

    public GUI_GeneratedExam(int width, int height) {
        // initialise the window
        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 300);

        // create the canvas that will hold the actual graphics
        // display the frame AFTER adding the panel to prevent drawing glitches
        frame.setVisible(true);
    }
    public void display(){
        for(int i=0; i<QuestionSet.questions.size(); i++){
            paper.setText(QuestionSet.questions.get(i).getText());
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            // create a new dog record in the kennels from the current text fields
            display();
        }
    }


}
