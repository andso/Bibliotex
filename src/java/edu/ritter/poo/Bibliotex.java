/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ritter.poo;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author anderson
 */
public class Bibliotex {
 
    private String name="Bibliotex";
    private String version = "0.1";
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
       
    public String getVersion(){
        return this.version;
    }
    
    
    public void saveIDK(){
        
        
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("BibliotexPU");
        Obra obra =new Obra();
        obra.setIdObra(1);
        obra.setTipoDeObra("dsdd");
        obra.setAutor("Silvio Santos");
        //obra.setDataPublicacao(new Date());
        obra.setDescricao("Vale mais do que dinheiro");
        obra.setTitulo("Show do milhao");  
        obra.setDataPublicacao(new Date());
        EntityManager em = emf.createEntityManager();
        em.persist(obra);
                        
    }
    
}
