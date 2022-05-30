package br.com.webscraping.spring;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.webscraping.spring.configuracao.Configuracao;

@SpringBootApplication
public class Application {
    
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
        
        final Configuracao config = new Configuracao();
        
        try {
            final Document doc = Jsoup.connect(config.getLinkDoSite()).get();
            System.out.print(doc);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
