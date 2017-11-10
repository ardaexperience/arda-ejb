package br.com.ardaexperience.entidade;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NamedQueries(
        @NamedQuery(name = "DetalhesPedido.consultarTodos", query = "SELECT e FROM DetalhesPedido e")
)

@Entity
@Table(name = "DETALHES_PEDIDO")
public class DetalhesPedido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(cascade = CascadeType.ALL)
    private DetalhesRoteiro detalhesRoteiro;
    
    private int quantidade;
    
    private double subtotal;
    
    private String EstadoPedido;

    public DetalhesPedido() {
    
    }

    public DetalhesPedido(DetalhesRoteiro detalhesRoteiro, int quantidade, 
            double subtotal, String EstadoPedido) {
        this.detalhesRoteiro = detalhesRoteiro;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
        this.EstadoPedido = EstadoPedido;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getEstadoPedido() {
        return EstadoPedido;
    }

    public void setEstadoPedido(String EstadoPedido) {
        this.EstadoPedido = EstadoPedido;
    }
    
}