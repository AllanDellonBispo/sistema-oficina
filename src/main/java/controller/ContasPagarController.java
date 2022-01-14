package controller;

import model.ContasPagar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class ContasPagarController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(ContasPagar contasPagar) {
        entityManager.getTransaction().begin();
        entityManager.persist(contasPagar);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Conta cadastrada com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    public ContasPagar buscarId(int id){
        ContasPagar contasPagar = entityManager.find(ContasPagar.class, id);
        return contasPagar;
    }

    public void remover(int id){
        ContasPagar contasPagar = entityManager.find(ContasPagar.class, id);
        if(contasPagar != null){
            entityManager.getTransaction().begin();
            entityManager.remove(contasPagar);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Conta excluida com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Não existe nenhumm conta cadastrada com esse id.");
        }

    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public void mostrarTodos(){
        String sql = "SELECT * FROM contasPagar";
        List<ContasPagar> contasPagar = entityManager.createNativeQuery(sql, ContasPagar.class)
                .getResultList();
        for(int i = 0; i<contasPagar.size(); i++){
            System.out.println("Conta "+ (i+1)+"º "+contasPagar.get(i).getCredor().getNome());
        }
    }

    //Função para atualizar a entidade
    public void atualiza(ContasPagar contasPagar) {
        entityManager.detach(contasPagar);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(contasPagar);
        JOptionPane.showMessageDialog(null,"Conta alterada com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }

}

