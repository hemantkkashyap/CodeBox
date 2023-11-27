 package com.Connectivity;

import java.sql.*;

public class Connectivity {
    
    public Connection c;
    public Statement s;
    public Connectivity(){
        try{
             DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
          c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
          s = c.createStatement();
        }  
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
