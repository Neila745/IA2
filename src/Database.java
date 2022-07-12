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
    public boolean findRecord(String filename,String data) {
        // search for a record matching data
        // return true if found
        int i=0;
        while (i<filename.length()){
            if(filename.equals(data)){
                System.out.println("true");
                return true;
            }
            i++;
        }
        System.out.println("false");
        return false;


        boolean found=false;  // flag for target txt being present
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            String line;
            while((line=br.readLine())!=null)  // classic way of reading a file line-by-line
                if(line.equals("something")){
                    found=true;
                    break;  // if the text is present, we do not have to read the rest after all
                }
        } catch(FileNotFoundException | IOException fnfe){}

        if(!found){  // if the text is not found, it has to be written
            try(PrintWriter pw=new PrintWriter(new FileWriter(file,true))){  // it works with
                // non-existing files too
                bw.println("something");
            }
        }
    }



    //TODO: appendRecord(String data)
    //TODO: deleteRecord()
    //TODO: getRecord(int rowNumber)
    //TODO: getRecordCount()
    //TODO: countRecord()
    //TODO: findRecord(String searchRecord)
}