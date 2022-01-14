package controller;

import java.util.ArrayList;
import model.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class CategoriaController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void adiciona(Categoria categoria) {
        entityManager.getTransaction().begin();
        entityManager.persist(categoria);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Categoria cadastrada com sucesso!");
        entityManager.close();
        entityManagerFactory.close();
    }

    //Função para remover entidades
    public void remove(int id) {
        Categoria categoria = entityManager.find(Categoria.class, id);
        if(categoria != null){
            entityManager.getTransaction().begin();
            entityManager.remove(categoria);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Categoria excluida com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Não existe categoria cadastrada com esse id.");
        }
    }

    //Função para atualizar a entidade
    public void atualiza(Categoria categoria) {
        entityManager.detach(categoria);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(categoria);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Categoria Alterada com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }

    public Categoria buscaId(int id){
        Categoria categoria = entityManager.find(Categoria.class, id);
        return categoria;
    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public List<Categoria> mostrarTodas(){
        String sql = "SELECT * FROM categorias";
        List<Categoria> categorias = entityManager.createNativeQuery(sql, Categoria.class)
                .getResultList();
        return categorias;
    }
    
    public List<String> mostrarNomesCategorias(){
        String sql = "SELECT * FROM categorias";
        List<Categoria> categorias = entityManager.createNativeQuery(sql, Categoria.class)
                .getResultList();
        
        ArrayList<String> nomesCategorias = new ArrayList<>();
        
        for(int i = 0; i< categorias.size(); i++){
            nomesCategorias.add(categorias.get(i).getNome());
        }
        
        return nomesCategorias;
    }
    
}
