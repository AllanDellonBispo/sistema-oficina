package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "tipos")
    private String tipo;

    @Column(name = "ano")
    private int ano;

    @Column(name = "cor", nullable = false)
    private String cor;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "placa", nullable = false)
    private String placa;

    @Column(name = "observacoes")
    private String observacoes;
    
    @Column(name = "proprietario")
    private String proprietario;

}
