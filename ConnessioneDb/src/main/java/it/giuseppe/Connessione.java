package it.giuseppe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import lombok.ToString;

@ToString
public class Connessione {

	 
	 int scelta;
	 
	  Scanner input = new Scanner(System.in);
	public Connessione(String JDBC_DRIVER, String DB_URL, String USER, String PASS, String sql, String sql1, String sql2, String sql3) {
		
		

		
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
		  		    System.out.println("query eseguita");
		  		      while (rs.next()) {
		  		        
		  		        String nome = rs.getString("nome_cliente");
		  		        String indirizzo = rs.getString("indirizzo_cliente");

		  		        System.out.print("nome: " + nome);
		  		        System.out.println(", indirizzo: " + indirizzo);
		  		       
		  		      }
		  		      rs.close();
		  		      stmt.close();
		        		
		        	}
		        	if(scelta==2) {
		        		stmt = conn.createStatement();
		        		
			  		     stmt.executeUpdate(sql1);
			  		   System.out.println("query eseguita");
		                 stmt.close();
		        		
		        	}
		        	
		        	if(scelta==3) {
		        		stmt = conn.createStatement();
		        		
			  		     stmt.executeUpdate(sql2);
			  		   System.out.println("query eseguita");
		                 stmt.close();
		        		
		        	}
		        	
		        	if(scelta==4) {
		        		stmt = conn.createStatement();
		        		
			  		     stmt.executeUpdate(sql3);
			  		     
			  		     System.out.println("query eseguita");
		                 stmt.close();
		        		
		        	}
		        	
		        	
		        	
		        	
		        }
		        conn.close();
		      } catch (SQLException se) {
		        se.printStackTrace();
		      }
		      
		    }  
	}
	
	
	
		
	}
		
		
	

