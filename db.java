import java.sql.*;

//class to connect to database

public class db {

	//class objects are defined    
    
	Connection connection;
    Statement statement;
    ResultSet resultset;

    //method to call connect is created    
    
    public db(){
        
        connectToDatabase();
        
    }

    // method to define database connection is created    
    
    public void connectToDatabase(){
    
    	//Connect to database
        
    	try{
            
            String databaseDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
            
            Class.forName(databaseDriver);
            
            String databaseReferenceName = "jdbc:odbc:MS Access Database";
            
            connection = DriverManager.getConnection(databaseReferenceName);
            
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String sqlCommand = "select * from Tbl_Customer_Zones";
            
            resultset = statement.executeQuery(sqlCommand);
            
                      
        //If error occurs catch and display in messagebox    
        
    	}
    	
    	catch(Exception ex){
            
        }
        
    }


//Main method to call database and GUI class    
    
    public static void main(String[] args) {
        
        new db();
        
        new gui();
    
    }
    
}

