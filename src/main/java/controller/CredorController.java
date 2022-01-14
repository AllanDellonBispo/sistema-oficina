package controller;

import model.Credor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class CredorController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(Credor credor) {
        entityManager.getTransaction().begin();
        entityManager.persist(credor);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }


    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public void mostrarTodos(){
        String sql = "SELECT * FROM credor";
        List<Credor> credores = entityManager.createNativeQuery(sql, Credor.class)
                .getResultList();
        for(int i = 0; i<credores.size(); i++){
            System.out.println("Credor "+ (i+1)+"º "+credores.get(i).getNome());
        }
    }

    //Função para atualizar a entidade
    public void atualiza(Credor credor) {
        entityManager.detach(credor);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(credor);
        JOptionPane.showMessageDialog(null,"Credor alterado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }
}
