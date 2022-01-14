package controller;

import model.Colaborador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class ColaboradorController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(Colaborador colaborador) {
        entityManager.getTransaction().begin();
        entityManager.persist(colaborador);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Colaborador cadastrado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    public void remover(int id){
        Colaborador colaborador = entityManager.find(Colaborador.class, id);
        if(colaborador != null){
            entityManager.getTransaction().begin();
            entityManager.remove(colaborador);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Colaborador excluido(a) com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Não existe nenhum colaborador cadastrado com esse id.");
        }

    }

    public Colaborador buscarId(int id){
        Colaborador colaborador = entityManager.find(Colaborador.class, id);
        return colaborador;
    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public void mostrarTodos(){
        String sql = "SELECT * FROM colaboradores";
        List<Colaborador> colaboradores = entityManager.createNativeQuery(sql, Colaborador.class)
                .getResultList();
        for(int i = 0; i<colaboradores.size(); i++){
            System.out.println("Colaborador "+ (i+1)+"º "+colaboradores.get(i).getNome());
        }
    }

    //Função para atualizar a entidade
    public void atualiza(Colaborador colaborador) {
        entityManager.detach(colaborador);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(colaborador);
        JOptionPane.showMessageDialog(null,"Colaborador alterado(a) com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }
}
