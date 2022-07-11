//imports for reading
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//imports for writing
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;
public class FileHandler{

    public static ArrayList<String> xreadFromFile(String fileName) {

        try (
                // to read from the file

                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
        )

        {
            ArrayList<String> records = new ArrayList<>();
            String line = br.readLine();
            // to print the WHOLE file
            while (line != null) {
                records.add(line);
                line = br.readLine();
            }
            return records;
        }
        //exception
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void xwriteToFile(String fileName, String text, boolean append) {
        // to write to the file
        // append: true= add to end, false= overwrite

        try (
                FileWriter fw = new FileWriter(fileName, append);
                PrintWriter pw = new PrintWriter(fw)
        ) {
            pw.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void appendLine(String fileName, String data){
        xwriteToFile(fileName,data,true);
    }

    public int countLines(String fileName){
        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);)
        {
            int count= 0;
            String line = br.readLine();
            while (line != null) {
                count = count +1;
                line = br.readLine();
            }
            return count;

        }
        catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    //TODO: why dont i have an output file? should i add it? how to add it?
    //TODO: difference between RandomRead vs this one? should i add it?
    //TODO: (IF CHANGING TO RANDOMREAD) readLineAt(String fileName, int start)
    //TODO: (IF CHANGING TO RANDOMREAD) writeLineAt(String fileName, String data, int start)

}
