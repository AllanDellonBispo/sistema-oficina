package controller;

import model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class VeiculoController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(Veiculo veiculo) {
        entityManager.getTransaction().begin();
        entityManager.persist(veiculo);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Veiculo cadastrado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    public Veiculo buscarId(int id){
        Veiculo veiculo = entityManager.find(Veiculo.class, id);
        return  veiculo;
    }

    public void remover(int id){
        Veiculo veiculo = entityManager.find(Veiculo.class, id);
        if(veiculo != null){
            entityManager.getTransaction().begin();
            entityManager.remove(veiculo);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Veiculo excluido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"N�o existe nenhum veiculo cadastrado com esse id.");
        }

    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public List<Veiculo> mostrarTodos(){
        String sql = "SELECT * FROM veiculos";
        List<Veiculo> veiculos = entityManager.createNativeQuery(sql, Veiculo.class)
                .getResultList();
       return veiculos;
    }
    
    public Veiculo buscarPorPlaca(String placa) {
        String sql = "SELECT * FROM veiculos WHERE placa = ?";
         Veiculo veiculo = (Veiculo) entityManager.createNativeQuery(sql, Veiculo.class)
                .setParameter(1, placa);
        return veiculo;
    }
    

    //Função para atualizar a entidade
    public void atualiza(Veiculo veiculo) {
        entityManager.detach(veiculo);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(veiculo);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Veiculo alterado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }
}
