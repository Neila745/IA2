import java.util.ArrayList;
public class userPassVerification{

    private Boolean loggedIn= false;

    public userPassVerification(Database db, String username, String password){
        ArrayList <String> records = db.getRecords();
        Boolean correct = false;
        for (int i=0; i<records.size(); i++){
            userPass uP = new userPass(records.get(i));
            if (uP.getUser().equals(username) && uP.getPass().equals(password)) {
                correct = true;
            }
        }
        if (correct== true){
            System.out.println("Correct details");
            loggedIn= true;
            GUI_test test = new GUI_test(300,300);
        }else{
            System.out.println("Incorrect details");
            loggedIn=false;
            GUI_UserPass_Error e = new GUI_UserPass_Error();
        }
    }

    Boolean isLoggedIn(){
        return loggedIn;
    }
}

