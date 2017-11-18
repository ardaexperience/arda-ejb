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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries(
    @NamedQuery(name = "Pedido.consultarTodos", query = "SELECT e FROM Pedido e")
)

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_EFETUACAO_PEDIDO", nullable = false)
    private Date dataEfetuacaoPedido;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "DETALHES_PEDIDO_ID")
    private DetalhesPedido detalhesPedido;

    public Pedido() {
    }

    public Pedido(Date dataEfetuacaoPedido, DetalhesPedido detalhesPedido) {
        this.dataEfetuacaoPedido = dataEfetuacaoPedido;
        this.detalhesPedido = detalhesPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataEfetuacaoPedido() {
        return dataEfetuacaoPedido;
    }

    public void setDataEfetuacaoPedido(Date dataEfetuacaoPedido) {
        this.dataEfetuacaoPedido = dataEfetuacaoPedido;
    }
    
    public DetalhesPedido getDetalhesPedido() {
        return detalhesPedido;
    }

    public void setDetalhesPedido(DetalhesPedido detalhesPedido) {
        this.detalhesPedido = detalhesPedido;
    }
    
}
    
