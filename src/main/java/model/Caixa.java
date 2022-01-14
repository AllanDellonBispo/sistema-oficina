package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "caixa")
public class Caixa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "saldo", nullable = false, precision = 11, scale = 2)
    private float saldo;
}
