package controller;

import model.Adiantamento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class AdiantamentoController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(Adiantamento adiantamento) {
        entityManager.getTransaction().begin();
        entityManager.persist(adiantamento);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Adiantamento cadastrado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    public Adiantamento buscarId(int id){
        Adiantamento adiantamento = entityManager.find(Adiantamento.class, id);
        return adiantamento;
    }

    public void remover(int id){
        Adiantamento adiantamento = entityManager.find(Adiantamento.class, id);
        if(adiantamento != null){
            entityManager.getTransaction().begin();
            entityManager.remove(adiantamento);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Adiantamento excluido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Não existe nenhum adiantamento cadastrado com esse id.");
        }

    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public void mostrarTodos(){
        String sql = "SELECT * FROM adiantamentos";
        List<Adiantamento> adiantamentos = entityManager.createNativeQuery(sql, Adiantamento.class)
                .getResultList();
        for(int i = 0; i<adiantamentos.size(); i++){
            System.out.println("Adiantamento "+ (i+1)+"º "+adiantamentos.get(i).getFuncionario().getNome());
        }
    }

    //Função para atualizar a entidade
    public void atualiza(Adiantamento adiantamento) {
        entityManager.detach(adiantamento);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(adiantamento);
        JOptionPane.showMessageDialog(null,"Adiantamento alterado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }
}
