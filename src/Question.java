public class Question{
    private String marks;
    private String questionText;
    private String topic;
    //MARKSCHEME?

    public Question(String marks, String questionText, String topic){
        this.marks= marks;
        this.questionText= questionText;
        this.topic = topic;
    }
    public Question (String record){
        //build an object from a comma seperated value record
        String fields[] = record.split(",");
        marks=fields[2].strip();
        questionText=fields[1].strip();
        topic=fields[0].strip();
    }

    public String getMarks(){
        return marks;
    }
    public String getTopic(){

        return topic;
    }
    public String getText(){

        return questionText;
    }


}

