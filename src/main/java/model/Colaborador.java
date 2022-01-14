package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "colaboradores")
public class Colaborador{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "rg", unique = false)
    private String rg;

    @Column(name = "cpf", nullable = false ,unique = false)
    private String cpf;

    @Column(name = "email", unique = false)
    private String email;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "dataDeNascimento", nullable = false)
    private LocalDateTime dataDeNascimento;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "salario", nullable = false, precision = 11, scale = 2)
    private float salario;

    @Column(name = "dataDeEntrada", nullable = false)
    private LocalDateTime dataDeEntrada;

    @Column(name = "tempoServico")
    private LocalDateTime tempoServico;

    @Column(name = "ultimoPagamento")
    private LocalDateTime ultimoPagamento;

    //Implementar => Fazer calculo do tempo de serviço
    public LocalDateTime getTempoServico(){
        LocalDateTime localDateTime = LocalDateTime.now();
        this.tempoServico = localDateTime;
        return this.tempoServico;
    }
}
