public class Question{
    private int marks;
    private String questionText;
    private String topic;

    public Question(int marks, String questionText, String topic){
        this.marks= marks;
        this.questionText= questionText;
        this.topic = topic;
    }
    public Question (String record){
        //build an object from a comma seperated value record
        if (!record.equals("")) {
            String fields[] = record.split(",");
            marks = Integer.parseInt(fields[2].strip());
            questionText = fields[1].strip();
            topic = fields[0].strip();
        }
    }

    public int getMarks(){
        return marks;
    }
    public String getTopic(){
        return topic;
    }
    public String getText(){
        return questionText;
    }
}

