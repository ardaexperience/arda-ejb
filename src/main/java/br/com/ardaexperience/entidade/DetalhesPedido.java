package br.com.ardaexperience.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries(
        @NamedQuery(name = "DetalhesPedido.consultarTodos", query = "SELECT e"
                + " FROM DetalhesPedido e")
)

@Entity
@Table(name = "DETALHES_PEDIDO")
public class DetalhesPedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "DATALHES_ROTEIRO_ID")
    private DetalhesRoteiro detalhesRoteiro;

    @Column(nullable = false, name = "ESTADO_PEDIDO")
    private String EstadoPedido;

    @Column(nullable = false, name = "QUANTIDADE_PESSOAS")
    private int quantidadePessoas;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false, name = "DATA_VIAGEM")
    private Date dataViagem;

    @Column(nullable = false)
    private double subtotal;

    public DetalhesPedido() {

    }

    public DetalhesPedido(DetalhesRoteiro detalhesRoteiro, String EstadoPedido, int quantidadePessoas, Date dataViagem, double subtotal) {
        this.detalhesRoteiro = detalhesRoteiro;
        this.EstadoPedido = EstadoPedido;
        this.quantidadePessoas = quantidadePessoas;
        this.dataViagem = dataViagem;
        this.subtotal = subtotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DetalhesRoteiro getDetalhesRoteiro() {
        return detalhesRoteiro;
    }

    public void setDetalhesRoteiro(DetalhesRoteiro detalhesRoteiro) {
        this.detalhesRoteiro = detalhesRoteiro;
    }

    public String getEstadoPedido() {
        return EstadoPedido;
    }

    public void setEstadoPedido(String EstadoPedido) {
        this.EstadoPedido = EstadoPedido;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public Date getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(Date dataViagem) {
        this.dataViagem = dataViagem;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}
