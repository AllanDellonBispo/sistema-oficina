package controller;

import model.Fornecedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class FornecedorController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void adiciona(Fornecedor fornecedor) {
        entityManager.getTransaction().begin();
        entityManager.persist(fornecedor);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Fornecedor "+fornecedor.getNome()+" cadastrado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    public void remover(int id){
        Fornecedor fornecedor = entityManager.find(Fornecedor.class, id);
        if(fornecedor != null){
            entityManager.getTransaction().begin();
            entityManager.remove(fornecedor);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Fornecedor excluido(a) com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"N�o existe nenhum fornecedor cadastrado com esse id.");
        }

    }

    public Fornecedor buscarId(int id){
        Fornecedor fornecedor = entityManager.find(Fornecedor.class, id);
        return fornecedor;
    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public List<Fornecedor> mostrarTodos(){
        String sql = "SELECT * FROM fornecedores";
        List<Fornecedor> fornecedores = entityManager.createNativeQuery(sql, Fornecedor.class)
                .getResultList();
        return fornecedores;
    }

    //Função para atualizar a entidade
    public void atualiza(Fornecedor fornecedor) {
        entityManager.detach(fornecedor);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(fornecedor);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Fornecedor alterado(a) com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }
}
