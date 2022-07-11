public class userPass{
    private String username;
    private String password;

    public userPass(String username, String password){
        this.username= username;
        this.password = password;
    }
    public userPass (String record){
        //build an object from a comma seperated value record
        String fields[] = record.split(",");
        username=fields[0].strip();
        password=fields[1].strip();
    }


    public String getUser(){
        return username;
    }
    public String getPass(){
        return password;
    }
}

