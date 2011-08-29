/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ritter.poo;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import junit.framework.TestCase;

/**
 *
 * @author anderson
 */
public class ObraTest extends TestCase {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public ObraTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        
        
        emf = Persistence.createEntityManagerFactory("BibliotexPU");
        em = emf.createEntityManager();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getIdObra method, of class Obra.
     */
    public void testGetIdObra() {
        System.out.println("getIdObra");
        Obra instance = new Obra();
      
        
        
        
        Obra obra =new Obra();
        obra.setIdObra(1);
        obra.setTipoDeObra("livro");
        obra.setAutor("Silvio Santos");
        
        obra.setDescricao("Vale mais do que dinheiro");
        obra.setTitulo("Show do milhao");  
        obra.setDataPublicacao(new Date());
      
        em.persist(obra);
        
                        
       // assertEquals(expResult, result);
       
        fail("The test case is a prototype.");
    }


}
