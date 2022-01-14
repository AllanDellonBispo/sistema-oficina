package controller;

import model.Servico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class ServicoController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //FunÃ§Ã£o para adicionar entidades
    public void adiciona(Servico servico) {
        entityManager.getTransaction().begin();
        entityManager.persist(servico);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Serviço cadastrado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    public void remover(int id){
        Servico servico = entityManager.find(Servico.class, id);
        if(servico != null){
            entityManager.getTransaction().begin();
            entityManager.remove(servico);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Serviço excluido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Não existe nenhum serviço cadastrado com esse id.");
        }

    }

    public Servico buscarId(int id){
        Servico servico = entityManager.find(Servico.class, id);
        return servico;
    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public List<Servico> mostrarTodos(){
        String sql = "SELECT * FROM servicos";
        List<Servico> servicos = entityManager.createNativeQuery(sql, Servico.class)
                .getResultList();
       return servicos;
    }
    
    public void zerarSolicitacoes(int id){
        entityManager.getTransaction().begin();
        Servico servico = entityManager.find(Servico.class, id);
        servico.setSolicitacoes(0);
        entityManager.merge(servico);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        JOptionPane.showMessageDialog(null, "Solicitações zeradas com sucesso!");
    }

    //FunÃ§Ã£o para atualizar a entidade
    public void atualiza(Servico servico) {
        entityManager.detach(servico);
        entityManager.getTransaction().begin();
        //ateraÃ§Ãµes ex: atendete.set...
        entityManager.merge(servico);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Serviço alterado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }
}
