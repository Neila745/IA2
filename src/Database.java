import java.util.ArrayList;
public class Database {
    //declaring variables
    private String filename;
    private ArrayList <String> records;

    public Database(String filename) {
        this.filename = filename;
        records = FileHandler.xreadFromFile(filename);
    }

    public ArrayList <String> getRecords(){
        return records;
    }

    //TODO: appendRecord(String data)
    //TODO: deleteRecord()
    //TODO: getRecord(int rowNumber)
    //TODO: getRecordCount()
    //TODO: countRecord()
    //TODO: findRecord(String searchRecord)
}