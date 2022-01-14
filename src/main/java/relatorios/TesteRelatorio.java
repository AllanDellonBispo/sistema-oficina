package relatorios;

import Fabrica.FabricaConexao;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

public class TesteRelatorio {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oficina");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void gerar(){
        try {
            Connection con = FabricaConexao.getConnection();
            String arquivoXML = "..//Sistema-Oficina//src//main//java//relatorios//MeuRelatorio.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(arquivoXML);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp);
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
