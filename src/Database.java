import java.io.*;
import java.util.ArrayList;

import java.io.IOException;
public class Database {
    //declaring variables
    private String filename;
    private ArrayList <String> records;
    private int rowWidth;
    private int recordCount;

    public Database(String filename, int rowWidth) {
        this.filename = filename;
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

        return FileHandler.readLineAt(filename, rowNumber * (rowWidth+1));
    }

    public boolean findQuestion(String data) {
        boolean found=false;
        int counter= 0;
        while (!found && counter<records.size()) {
            Question q = new Question(records.get(counter));
            if (q.getText().equals(data)) {//TODO: COMMA NEEDED + NOT ALREADY THERE
                found = true;
            }
            counter++;
        }
        return found;
    }
    public void addRecord(String record){
        FileHandler.xwriteToFile(filename, record, true);
        records.add(record);
    }


    //TODO: appendRecord(String data)
    //TODO: deleteRecord()
    //TODO: getRecord(int rowNumber)
    //TODO: getRecordCount()
    //TODO: countRecord()
    //TODO: findRecord(String searchRecord)
}