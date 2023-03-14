/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountingsystem;



/**
 *
 * @author HPLaptop
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class InitConnection {
   public static Connection initConn()
   {
        Connection con=null;
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7to8","root","root");     }catch(Exception tt)
      {
          System.out.println(tt);
      }
       return con;
    }
}
