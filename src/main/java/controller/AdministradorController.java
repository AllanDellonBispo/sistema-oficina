package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import model.Administrador;
import model.Atendente;

public class AdministradorController {
    
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(Administrador administrador) {
        entityManager.getTransaction().begin();
        entityManager.persist(administrador);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Administrador cadastrado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }
    
    public List<Administrador> mostrarTodos(){
        String sql = "SELECT * FROM administradores";
        List<Administrador> administradores = entityManager.createNativeQuery(sql, Administrador.class)
                .getResultList();
        
        return administradores;
        
    }

    public void demitirAtendentePorNome(String nome){

    }

    public void demitirAtendentePorCPF(String cpf){

    }
}
