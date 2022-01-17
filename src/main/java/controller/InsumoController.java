package controller;

import model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class InsumoController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void adiciona(Insumo insumo) {
        entityManager.getTransaction().begin();
        entityManager.persist(insumo);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void remover(int id){
        Insumo insumo = entityManager.find(Insumo.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(insumo);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
    }

    public Insumo buscarId(int id){
        Insumo insumo = entityManager.find(Insumo.class, id);
        return insumo;
    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public List<Insumo> mostrarTodos(){
        String sql = "SELECT * FROM insumos";
        List<Insumo> insumos = entityManager.createNativeQuery(sql, Insumo.class)
                .getResultList();
        return insumos;
    }
    //Função para atualizar a entidade
    public void atualiza(Insumo insumo) {
        entityManager.detach(insumo);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(insumo);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Insumo alterado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }
    
    //Função para atualizar a entidade
    public void atualizaQuantidade(Insumo insumo) {
        entityManager.detach(insumo);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(insumo);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Insumo alterado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }

    public void vender(int id, int quantidadePedida){
        Insumo insumo = entityManager.find(Insumo.class, id);
        if(insumo.getQuantidadeTotal() >= quantidadePedida){
            entityManager.getTransaction().begin();
            insumo.setQuantidadeTotal(insumo.getQuantidadeTotal() - quantidadePedida);
            entityManager.merge(insumo);
            entityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(null,"Venda realizada com sucesso!");
            entityManager.close();
            entityManagerFactory.close();
        }else{
            JOptionPane.showMessageDialog(null,"Estoque insuficiente! Existem apenas " +
                    insumo.getQuantidadeTotal() + "unidades dispon��veis");
        }

    }

}
