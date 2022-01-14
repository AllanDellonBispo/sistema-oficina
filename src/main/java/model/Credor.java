package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "credores")
public class Credor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "descricao")
    private String descricao;
}
