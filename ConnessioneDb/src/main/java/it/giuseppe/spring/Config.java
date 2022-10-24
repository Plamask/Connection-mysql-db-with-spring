package it.giuseppe.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.giuseppe.Connessione;


@Configuration
@ComponentScan(basePackageClasses = Connessione.class)
public class Config {

	 @Bean
	    public Connessione getConnessione() {
		 
		 return new Connessione("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/gestione_surgelati", "giuseppe", "peppe", "SELECT nome_cliente, indirizzo_cliente FROM cliente", "INSERT INTO fornitore (nome_fornitore, indirizzo, partita_iva, user, password) VALUES ('Ciro', 'Via Roma 20', '', 'Cane', 'Gatto')", "UPDATE fornitore SET partita_iva = '0001' WHERE(partita_iva = '02458')", "DELETE FROM fornitore WHERE(partita_iva = '5656565655')");
	 }
	 
}


