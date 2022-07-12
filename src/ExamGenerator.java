//exam class
//arraylist of questions
//total marks, list of allowed topics, markscheme, date and title
//method: add questions
//display method: formate paper
//display markscheme method
public class ExamGenerator{
    public ExamGenerator(){
        Database myDatabase = new Database("input.txt",100);
        Database myDatabaseTwo = new Database("userPass.txt",100);/*
//TODO: create login GUI class

      User u = new User();
      String username =u.getInputUser();
      String password =u.getInputPass();

      userPassVerification verified = new userPassVerification(myDatabaseTwo, username, password);
*/
//TODO: MOVE TO ANOTHER METHOD ONCE GUI FOR GROUPING CLASS
     /* Grouping g = new Grouping();
      g.Grouping();
      String topic =g.getInputTopic();
      int minMarks = g.getInputMinMarks();
      int maxMarks = g.getInputMaxMarks();
      QuestionSet testSet = new QuestionSet(myDatabase,topic,minMarks,maxMarks);
      testSet.display();*/



    }
}