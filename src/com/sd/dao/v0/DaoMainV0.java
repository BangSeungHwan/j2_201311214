package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;

public class DaoMainV0 {
  public static void main(String[] args){
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs=null;
    try {
      String path = System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(
               prop.getProperty("URL")+"?useSSL=true",
               prop.getProperty("USER"),
               prop.getProperty("PASSWORD")
      );
      stmt = conn.createStatement();
      
      String mySql = "INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      conn.createStatement().execute(mySql);
      mySql = "INSERT INTO persons(name,address) VALUES('v0-2','2 Hongji Dong')";
      conn.createStatement().execute(mySql);
      mySql = "DELETE FROM persons WHERE id=3 LIMIT 1";
      conn.createStatement().execute(mySql);
      
      rs=stmt.executeQuery("SELECT name FROM persons WHERE id < 4 ORDER BY id");
      while(rs.next()) {
        System.out.println(rs.getString("name"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
        if(rs != null) rs.close();
      } catch (Exception e) {}
    }
  }
}