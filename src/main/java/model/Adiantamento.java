package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "adiantamentos")
public class Adiantamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private Atendente funcionario;

    @OneToOne
    private Colaborador colaborador;

    @Column(name = "data")
    private LocalDateTime data;

    @Column(name = "valor")
    private float valor;
}
