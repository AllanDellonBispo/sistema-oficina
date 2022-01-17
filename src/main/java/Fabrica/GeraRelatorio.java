
package Fabrica;

import Fabrica.FabricaConexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Allan
 */
public class GeraRelatorio {
    
    public void gerar(){
        
        try {
        String arquivoXML = "Insumos-mais-vendidos.jrxml";
        Connection con = new FabricaConexao().getConnection(); 
        JasperReport jr = JasperCompileManager.compileReport(arquivoXML);
        JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
        JasperViewer.viewReport(jp);
        con.close();
        } catch (SQLException ex) {
            Logger.getLogger(GeraRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }catch (JRException ex) {
            Logger.getLogger(GeraRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public static void main(String[] args) {
        GeraRelatorio g = new GeraRelatorio();
        g.gerar();
    }
}
