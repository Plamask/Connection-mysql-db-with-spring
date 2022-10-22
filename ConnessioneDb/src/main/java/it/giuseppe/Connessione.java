package it.giuseppe;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import lombok.ToString;

@ToString
public class Connessione {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	  static final String DB_URL = "jdbc:mysql://localhost/gestione_surgelati";
	  static final String USER = "giuseppe";
	  static final String PASS = "peppe";
	public Connessione() {
		
		

		
		    Connection conn = null;
		    
		    try {
		      Class.forName(JDBC_DRIVER);
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      
		      
		    } catch (SQLException se) {
		      se.printStackTrace();
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      try {
		        
		        if (conn != null) {
		        	System.out.println("Connessione al db effettuata");
		        }
		        conn.close();
		      } catch (SQLException se) {
		        se.printStackTrace();
		      }
		      
		    }
		  
	}
	
}
