import java.util.ArrayList;

public class Database {
    //declaring variables
    private String fileName;
    private ArrayList <String> records;
    private int rowWidth;
    private int recordCount;

    public Database(String filename, int rowWidth) {
        this.fileName = filename;
        this.rowWidth = rowWidth;
        records = FileHandler.xreadFromFile(filename);
        countRecord();

    }
    public int getRecordCount(){
        return recordCount;
        // READ THE ENTIRE DATA BASE ANC COUNT THE RECORDS
    }
    public void countRecord(){
        int count =0;
        String record= getRecord(count);
        while (record != null){
            count++;
            record=getRecord(count);

        }
        recordCount = count;
    }
    public ArrayList <String> getRecords(){
        return records;
    }
    public String getRecord(int rowNumber) {

        return FileHandler.readLineAt(fileName, rowNumber * (rowWidth+1));
    }

   public boolean findQuestion(String data) {
        boolean found=false;
        int counter= 0;
        while (!found && counter<records.size()) {
            Question q = new Question(records.get(counter));
            if (q.getText().equals(data)) {
                found = true;
                GUI_Error_Database ed = new GUI_Error_Database();
            }
            counter++;
        }
        return found;
    }

    public void addRecord(String topic, String data, int marks) {
        if (findQuestion(data) == false){
            FileHandler.xwriteToFile(fileName,  topic + ", " + data + ", " + marks ,  true );
            records.add(topic + ", " + data + ", " + marks );
        }
    }

    //TODO: appendRecord(String data)
    //TODO: deleteRecord()
    //TODO: getRecord(int rowNumber)
    //TODO: getRecordCount()
    //TODO: countRecord()
    //TODO: findRecord(String searchRecord)
}