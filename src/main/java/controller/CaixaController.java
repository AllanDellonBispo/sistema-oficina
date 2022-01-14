package controller;

import model.Caixa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class CaixaController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public float buscaId(){
        Caixa caixa = entityManager.find(Caixa.class, 1);
        return caixa.getSaldo();
    }

    public void atualizaCaixaPositivo(float valor){
        if (entityManager.find(Caixa.class, 1) == null) {
            Caixa caixa = new Caixa();
            caixa.setSaldo(valor);
            entityManager.getTransaction().begin();
            entityManager.persist(caixa);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
        }else{
            
            float novoSaldo = entityManager.find(Caixa.class, 1).getSaldo() + valor;
            Caixa caixaAtualizado = entityManager.find(Caixa.class, 1);
            caixaAtualizado.setSaldo(novoSaldo);
            entityManager.getTransaction().begin();
            entityManager.merge(caixaAtualizado);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
        }
    }
    
    
    public void atualizaCaixaNegativo(float valor){
        if (entityManager.find(Caixa.class, 1) == null) {
            Caixa caixa = new Caixa();
            caixa.setSaldo(valor);
            entityManager.getTransaction().begin();
            entityManager.persist(caixa);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
        }else{
            
            float novoSaldo = entityManager.find(Caixa.class, 1).getSaldo() - valor;
            Caixa caixaAtualizado = entityManager.find(Caixa.class, 1);
            caixaAtualizado.setSaldo(novoSaldo);
            entityManager.getTransaction().begin();
            entityManager.merge(caixaAtualizado);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
