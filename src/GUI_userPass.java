import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// provides a way to create new graph pop-ups
public class GUI_userPass extends JFrame implements ActionListener {

    private JFrame frame;
    private JLabel  userPassText;
    private JTextField enterUser;
    private JPasswordField enterPass;
    private JButton button;

    public GUI_userPass() {
        frame = new JFrame("userPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0, 800, 600);
        frame.setLayout(null);


        userPassText = new JLabel ("Enter username and password:");
        userPassText.setBounds(50, 50, 400, 40);
        frame.getContentPane().add(userPassText);
        enterUser = new JTextField ();
        enterUser.setBounds(50, 90, 400, 40);
        frame.getContentPane().add(enterUser);
        enterPass = new JPasswordField ();
        enterPass.setBounds(50, 130, 400, 40);
        frame.getContentPane().add(enterPass);

        button = new JButton("Enter");
        button.setBounds(50,180,100,40);
        button.addActionListener(this);
        frame.getContentPane().add(button);
        button = new JButton("Close");
        button.setBounds(170,180,100,40);
        frame.getContentPane().add(button);

        frame.setVisible(true);
        System.out.println("GUI ready");

    }

    public void verify(){
        Database myDatabaseTwo = new Database("userPass.txt",100);
//TODO: create login GUI class
        System.out.println("name= " +enterUser.getText());
        User u = new User(enterUser.getText(), enterPass.getText());

        String username =u.getInputUser();
        String password =u.getInputPass();

        userPassVerification verified = new userPassVerification(myDatabaseTwo, username, password);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Enter")) {
            verify();

        }else if(e.getActionCommand().equals("Cancel")){
            enterUser.setText("");
            enterPass.setText("");
        }
    }
}