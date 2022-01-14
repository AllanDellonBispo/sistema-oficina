package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity(name = "orcamentos")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    private Veiculo veiculo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Insumo> insumos;

    @Column(name = "observacoes")
    private String observacoes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Servico> servico;

    @Column(name = "hora")
    private LocalDateTime hora;

    @Column(name = "valorTotal", scale = 2)
    private float valorTotal;

}
