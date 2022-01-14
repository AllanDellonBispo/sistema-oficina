package controller;

import model.Atendente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class AtendenteController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(Atendente atendente) {
        entityManager.getTransaction().begin();
        entityManager.persist(atendente);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Atendente cadastrado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    //Função para remover entidades
    public void remove(int id) {
        Atendente atendente = entityManager.find(Atendente.class, id);
        if(atendente != null){
            entityManager.getTransaction().begin();
            entityManager.remove(atendente);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Atendente excluido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Não existe atendente cadastrado com esse id.");
        }
    }

    //Função para atualizar a entidade
    public void atualiza(Atendente atendente) {
        //entityManager.detach(atendente);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(atendente);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Atendente Alterado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }

    public Atendente buscaId(int id){
        Atendente atendente = entityManager.find(Atendente.class, id);
        return atendente;
    }

    //Função inacabada => Assistir aulas de Named e JPQL
    public List<Atendente> buscaNome(String nome) {
        String sql = "SELECT * FROM atendentes WHERE nome LIKE '%?%'";
         List<Atendente> atendentes = entityManager.createNativeQuery(sql, Atendente.class)
                .setParameter(1, nome)
                .getResultList();
        return atendentes;
    }

    //Retorna a entidade de acordo com o número do seu CPF
    public void buscaCPF(String cpf) {
        String sql = "SELECT * FROM atendentes WHERE cpf = ?";
        Atendente a = (Atendente) entityManager.createNativeQuery(sql, Atendente.class)
                .setParameter(1, cpf)
                .getSingleResult();
       // System.out.println(a.getNome());
    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public List<Atendente> mostrarTodos(){
        String sql = "SELECT * FROM atendentes";
        List<Atendente> atendentes = entityManager.createNativeQuery(sql, Atendente.class)
                .getResultList();
        
        return atendentes;
        
    }


}