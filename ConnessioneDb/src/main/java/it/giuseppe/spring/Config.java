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
		 
		 return new Connessione();
	 }
}
