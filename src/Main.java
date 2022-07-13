import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("IA");
        //Database
        Database db= new Database("input.txt", 100);
        db.findQuestion("cQuestion");
        //ExamGenerator EG = new ExamGenerator();
        //EG.ExamGenerator();
        //QuestionSet(myDatabase, "Binaryuserd Search", 1, 100);
        System.out.println("Starting.");
        GUI_userPass gui = new GUI_userPass();
        System.out.println("Finished.");
        //User
        //User u = new User("user","pass");
        //u.display();
        //u.userVerification("userPass.txt");//don't work
        //Generating Questions

        //g.questionsInBinaryTopic();

        //q.isTopicValid("input.txt"); //??
        //q.printLine("input.txt"); //??

    }
}