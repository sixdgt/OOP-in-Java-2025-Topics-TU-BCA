package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    static DbConnection instance = null;
    static Connection connection = null;
    // constructor
    public DbConnection(){
        String url = "jdbc:mysql://localhost:3306/mvclab";
        String username = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static DbConnection getInstance(){
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }
    
    public Connection getConnection(){
        return connection;
    }
}
