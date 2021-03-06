import java.util.ArrayList;

public class QuestionSet{
    public static ArrayList <Question> questions;

    public QuestionSet(Database db, String topic, int minMarks, int maxMarks){
        questions = new ArrayList<>();
        ArrayList <String> records = db.getRecords();
        for (int i=0; i<records.size(); i++){
            Question q = new Question(records.get(i));
            if (!q.getTopic().equals(topic) || q.getMarks() < minMarks || q.getMarks() > maxMarks) {
                continue;
            }
            questions.add(q);

        }
    }



    public String getText() {
        String allQuestions= "";
        for (int i = 0; i < questions.size(); i++) {
            allQuestions = allQuestions + questions.get(i).getText() + "\n";
        }
        return allQuestions;
    }
}

//new class= set of question- filters(topics, max marks/ min marks)
//method: load question in
//method: filtering questions
//method: get the current filtered list


