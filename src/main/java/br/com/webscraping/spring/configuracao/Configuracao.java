package br.com.webscraping.spring.configuracao;

import java.io.File;

public class Configuracao {
    
    private final String path = "/Documents/processo/web-scraping-download-anexos/resultado.zip";
    
    private final String linkDoSite = "https://www.gov.br/ans/pt-br/assuntos/consumidor/o-que-o-seu-plano-de-saude-deve-cobrir-1/o-que-e-o-rol-de-procedimentos-e-evento-em-saude";
    
    public Configuracao() {
        this.configurarArquivo();
    }
    
    public String getPath() {
        return this.path;
    }
    
    public String getLinkDoSite() {
        return this.linkDoSite;
    }
    
    public void configurarArquivo() {
        
        try {
            final File arquivo = new File(this.getPath());
            
            if (arquivo.exists()) {
                System.out.println("O arquivo já existe!");
            } else {
                arquivo.createNewFile();
            }
            
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
    
}
