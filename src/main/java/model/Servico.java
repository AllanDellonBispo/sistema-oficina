package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "servicos")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "preco", nullable = false, scale = 2)
    private float preco;

    @Column(name = "solicitacoes")
    private int solicitacoes;
}
