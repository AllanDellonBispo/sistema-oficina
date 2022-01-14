package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "insumos")
public class Insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "preco", nullable = false, precision = 11, scale = 2)
    private double preco;

    @Column(name = "quantidadeTotal", nullable = false)
    private int quantidadeTotal;

    @Column(name = "quantidadeMinima")
    private int quantidadeMinima;

    @Column(name = "fornecedor", nullable = false)
    private String fornecedor;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "solicitacoes", nullable = false)
    private int solicitacoes;
}
