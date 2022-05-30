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
            final Document documento = Jsoup.connect(config.getLinkDoSite()).get();
            System.out.print(documento.getElementsContainingOwnText("Anexo I"));
            
            // final Elements elemento = documento.select("Anexo I");
            
            // System.out.println(elemento);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
