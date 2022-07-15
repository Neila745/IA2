import java.util.ArrayList;
public class QuestionSet{
    public static ArrayList <Question> questions;

    public QuestionSet(Database db, String topic, String minMarks, String maxMarks){
        questions = new ArrayList<>();
        ArrayList <String> records = db.getRecords();
        for (int i=0; i<records.size(); i++){
            Question q = new Question(records.get(i));
            if (q.getTopic().equals(topic) && q.getMarks().equals(minMarks) && q.getMarks().equals(maxMarks)){
                questions.add(q);

            }
        }
    }

    public ArrayList<Question> getArray(){
        return questions;
    }


    public void display(){
        for(int i=0; i<questions.size(); i++){
            System.out.println(questions.get(i).getText());
        }
    }


}

//new class= set of question- filters(topics, max marks/ min marks)
//method: load question in
//method: filtering questions
//method: get the current filtered list


