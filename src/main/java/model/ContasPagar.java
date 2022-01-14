package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "contasPagar")
public class ContasPagar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private Credor credor;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "valor", nullable = false, precision = 11, scale = 2)
    private float valor;

    @Column(name = "parcelas", nullable = false)
    private int quantidadeParcelas;

    @Column(name = "formaPagamento", nullable = false)
    private String formaPagamento;

    @Column(name = "vencimento")
    private LocalDateTime dataVencimento;

    @Column(name = "mensalidade")
    private float mensalidade;

    @Column(name = "statusDeAtrasado")
    private boolean emAtraso;

    @Column(name = "statusPago")
    private boolean situacaoPago;
}
