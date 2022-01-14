package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

@Data
@Entity(name = "atendentes")
public class Atendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "rg")
    private String rg;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "dataDeNascimento")
    private String dataDeNascimento;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "cep")
    private String cep;

    @Column(name = "salario", nullable = false, precision = 11, scale = 2)
    private float salario;

    @Column(name = "dataDeEntrada")
    private LocalDateTime dataDeEntrada;

    @Column(name = "tempoServico")
    private LocalDateTime tempoServico;

    @Column(name = "ultimoPagamento")
    private LocalDateTime ultimoPagamento;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "senha")
    private String senha;

    //Implementar => Fazer calculo do tempo de serviço
    public LocalDateTime getTempoServico(){
        LocalDateTime localDateTime = LocalDateTime.now();
        this.tempoServico = localDateTime;
        return this.tempoServico;
    }

    public void forEach(ASN1ObjectIdentifier asN1ObjectIdentifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
