package it.giuseppe;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import lombok.ToString;

@ToString
public class Connessione {

	
	public Connessione(String JDBC_DRIVER, String DB_URL, String USER, String PASS, String sql) {
		
		

		
		 Connection conn = null;
		    Statement stmt = null;
		    
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
		        	System.out.println("Premi 1 per fare una select , 2 per insert, 3 per update, 4 per delete");
		        	scelta = input.nextInt();
		        	if(scelta == 1) {
		        		stmt = conn.createStatement();
		  		     
		  		      ResultSet rs = stmt.executeQuery(sql);
		  		      while (rs.next()) {
		  		        
		  		        String nome = rs.getString("nome_cliente");
		  		        String indirizzo = rs.getString("indirizzo_cliente");

		  		        System.out.print("nome: " + nome);
		  		        System.out.println(", indirizzo: " + indirizzo);
		  		       
		  		      }
		  		      rs.close();
		  		      stmt.close();
		        		
		        	}
				 }
		        conn.close();
		      } catch (SQLException se) {
		        se.printStackTrace();
		      }
		      
		    }  
	
}
