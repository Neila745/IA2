import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// provides a way to create new graph pop-ups
public class GUI_Database extends JFrame implements ActionListener {
    private JFrame frame;
    public GUI_Database(int width, int height){
        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
