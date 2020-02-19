/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chats;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author user2
 */
public class LogsMaintain {
    String conn="jdbc:mysql://localhost:3306/users?zeroDateTimeBehavior=convertToNull";

    String log;
    public LogsMaintain(String Logs) {
        
        this.log=Logs;
        this.logsM(Logs);
    }
    
    public void logsM(String Logs){
    try{
   
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(conn,"root","");
    Statement st=con.createStatement();
      String query="insert into logs(logs) values('"+Logs+"')";
                
   st.executeUpdate(query);
             
    }
    catch(Exception ex){
    System.out.println("Somthing went wrong while maintaing logs "+ex);
    }
    }
      
}
