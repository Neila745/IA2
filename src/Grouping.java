//imports for reading
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//imports for writing
import java.io.PrintWriter;
import java.io.FileWriter;
//import for arraylist 
import java.util.ArrayList;
//import for user input
import java.util.Scanner;
public class Grouping{
    public int minMarksInput;
    public int maxMarksInput;
    public String topic;
    public String question;
    //ArrayList<String> binary = new ArrayList<>();
    //ArrayList<String> topics = new ArrayList<>();
    //ArrayList<String> questions = new ArrayList<>();
    //ArrayList<String> marks = new ArrayList<>();
    // take the test length and topic
    public void Grouping(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Minimum Marks For Question: ");
        minMarksInput = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please Enter Maximum Marks For Question: ");
        maxMarksInput = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please Enter A Topic: ");
        topic = sc3.nextLine();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Please Enter A Question: ");
        question = sc4.nextLine();
    }

    public String getInputQuestion(){
        return question;
    }
    public String getInputTopic(){
        return topic;
    }
    public int getInputMinMarks(){
        return minMarksInput;
    }

    public int getInputMaxMarks(){
        return maxMarksInput;
    }


  /*public ArrayList<String> questionsForTopic(String fileName){
    ArrayList<String> questions = new ArrayList<String>();
    List<String> group = new ArrayList<>();
for (int i = 0; i < readword.size(); i++)
    if (readword.get(i + 1).equals(nationality)
        group.add(readword.get(i));
  }*/
  
 /* 
//TODO: why doesnt it print all questions?
//prints lines related to the topic question
  public void printLine(String fileName){
    try (
     FileReader fr = new FileReader(fileName);
     BufferedReader br = new BufferedReader(fr);)
     {
      
      while (fileName != null) {
        String line = br.readLine();
        if (line.contains(topic)){
          String question = br.readLine();
          System.out.println(question);
        }else{
          br.readLine();
        }
      }
    }

    catch (IOException e) {
 	    e.printStackTrace();
    }
     
  }


/* 
//see if topic is in database
  public void isTopicValid(String fileName){
      boolean isValid= false;
        if (fileName.contains(topic)){
          System.out.println("There are questions on that topic");
          isValid= true;
        }else{
          System.out.println("There aren't questions on that topic");
          isValid= false;
        }
    
  }

*/

/*
  public void printLine(String fileName){
    try (
     FileReader fr = new FileReader(fileName);
     BufferedReader br = new BufferedReader(fr);)
     {
      String line = br.readLine();
      while (line != null) {
        if (line.contains(topic)){
          String question = br.readLine();
          System.out.println(question);
        }else{
          br.readLine();
        }
      }
    }

    catch (IOException e) {
 	    e.printStackTrace();
    }
     
  }


  public void printLine(String fileName){
    try (
     FileReader fr = new FileReader(fileName);
     BufferedReader br = new BufferedReader(fr);)
     {
      String line = br.readLine();
      while ((line=br.readLine())!=null) {
        if (line.equals(topic)){
          String question = br.readLine();
          System.out.println(question);
        }else{
          br.readLine();
          System.out.println("no");
        }
      }
    }

    catch (IOException e) {
 	    e.printStackTrace();
    }
     
  }
  */




    //TODO: sort into different topics (lots of txt or sort 1 txt into topics???)- done
    //TODO: use the "Length" input to make test a certain length
    //TODO: which paper Qs have appeared in




//NEW TODOS----------------

}