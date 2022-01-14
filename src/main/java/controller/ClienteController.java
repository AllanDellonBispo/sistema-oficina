package controller;

import model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class ClienteController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(Cliente cliente) {
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Cliente cadastrado(a) com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    public void remover(int id){
        Cliente cliente = entityManager.find(Cliente.class, id);
        if(cliente != null){
            entityManager.getTransaction().begin();
            entityManager.remove(cliente);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Cliente excluido(a) com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Não existe nenhum cliente cadastrado com esse id.");
        }

    }

    public Cliente buscarId(int id){
        Cliente cliente = entityManager.find(Cliente.class, id);
        return cliente;
    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public List<Cliente> mostrarTodos(){
        String sql = "SELECT * FROM clientes";
        List<Cliente> clientes = entityManager.createNativeQuery(sql, Cliente.class)
                .getResultList();
        return clientes;
    }

    //Função para atualizar a entidade
    public void atualiza(Cliente cliente) {
        entityManager.detach(cliente);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Cliente alterado(a) com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }
}
