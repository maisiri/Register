import com.mongodb.*;

import javax.swing.*;

public class main {
    static MongoClientURI uri;
    static MongoClient client;
    static  BasicDBObject insertUser;
    static  DBCollection con;
    static  DB db;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        register loginPanel = new register();
        frame.setContentPane(loginPanel.getPanel1());
        frame.pack(); /*it makes firm size*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);/*can see*/
    }
     public main(){
         try {
             uri  = new MongoClientURI("mongodb://oxgame:oxgame123@ds245532.mlab.com:45532/oxgame");
             client = new MongoClient(uri);
             db = client.getDB("oxgame");

         }catch (Exception g){

         }

     }


        public void input(String username, String email, String password) {
             con = db.getCollection("User");
            BasicDBObject in= new BasicDBObject();
            in.put("user",username);
            in.put("Email",email);
            in.put("Password",password);
            con.insert(in);

        }
    }

