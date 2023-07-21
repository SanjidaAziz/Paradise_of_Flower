package paradiseofflowers;

import java.sql.*;

public class Data {

    private Connection con;
    private Statement stmnt;
    private ResultSet rs;

    public Connection DBConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1/paradise_of_flowers";
        String username = "root";
        String password = "";
        Class.forName (
        "com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(url, username, password);

        System.out.println (
        "Connection Established");

        return con ;
    }

public void setData(String name, String password) throws SQLException, ClassNotFoundException{
        con=DBConnection();
        if(con!=null){
            
            try{                
                stmnt=con.createStatement();
                String query = "INSERT INTO `login` (`username`, `password`) VALUES ('"+name+"', '"+password+"')";
                stmnt.executeUpdate(query);
            }
            catch (SQLException e){
                
                System.out.println(e);
            }
            finally {
                stmnt.close();
                con.close();
            }           
        }
        else {
            System.out.println("Connection failed!!!");
        }
    }
    
    public String getPass(String s) throws SQLException, ClassNotFoundException{
        con=DBConnection();
        if(con!=null){
            try{
            stmnt=con.createStatement();
            rs=stmnt.executeQuery("SELECT * FROM `login` WHERE `username` LIKE '"+s+"'");
            rs.next();
            }
            catch (SQLException e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("Connection Failed!!!");
        }
        return rs.getString("password");
        
        
    }
   
}
