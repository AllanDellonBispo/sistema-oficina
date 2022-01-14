package model;

import lombok.Data;

import javax.persistence.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity(name = "clientes")
public class Cliente {

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

    @Column(name = "dataDeNascimento", nullable = false)
    private LocalDateTime dataDeNascimento;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "numeroDaCasa")
    private int numeroDaCasa;

    @OneToMany
    private List<Veiculo> veiculo;

    @Column(name = "atendente")
    private String nomeAtendente;

    @Column(name = "dataDeCadastro")
    private LocalDateTime dataCadastro;

}
