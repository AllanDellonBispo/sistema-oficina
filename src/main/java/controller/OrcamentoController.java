package controller;

import Fabrica.FabricaConexao;
import model.Orcamento;
import model.Servico;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class OrcamentoController {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Função para adicionar entidades
    public void adiciona(Orcamento orcamento) {
        entityManager.getTransaction().begin();
        entityManager.persist(orcamento);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Orçamento cadastrado com sucesso!");
        //Implementar quantidade de solicitações
        //ArrayList<Servico> servicos = (ArrayList<Servico>) entityManager.find(Orcamento.class, orcamento.getId()).getServico();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void remover(int id){
        Orcamento orcamento = entityManager.find(Orcamento.class, id);
        if(orcamento != null){
            entityManager.getTransaction().begin();
            entityManager.remove(orcamento);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
            JOptionPane.showMessageDialog(null,"Orçamento excluido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Não existe nenhum Orçamento cadastrado com esse id.");
        }

    }

    public Orcamento buscarId(int id){
        Orcamento orcamento = entityManager.find(Orcamento.class, id);
        return orcamento;
    }

    //Retorna todos as entidades presentes no banco e as coloca dentro da lista atendentes
    public void mostrarTodos(){
        String sql = "SELECT * FROM orcamentos";
        List<Orcamento> orcamentos = entityManager.createNativeQuery(sql, Orcamento.class)
                .getResultList();
        for(int i = 0; i<orcamentos.size(); i++){
            System.out.println("Orçamento "+ (i+1)+"º "+orcamentos.get(i).getCliente().getNome());
        }
    }

    //Função para atualizar a entidade
    public void atualiza(Orcamento orcamento) {
        entityManager.detach(orcamento);
        entityManager.getTransaction().begin();
        //aterações ex: atendete.set...
        entityManager.merge(orcamento);
        JOptionPane.showMessageDialog(null,"Orçamento alterado com sucesso!");
        entityManager.close();
        entityManagerFactory.close();

    }

    public void emitirOrcamento(Orcamento orcamento){
        try {
            Connection con = FabricaConexao.getConnection();
            String arquivoXML = "..//Sistema-Oficina//src//main//java//relatorios//OrcamentoRelatorio.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(arquivoXML);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp);
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao emitir o relatório!");
        }
    }
}
