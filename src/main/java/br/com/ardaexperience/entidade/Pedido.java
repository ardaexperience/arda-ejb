package br.com.ardaexperience.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    @Temporal(TemporalType.DATE)
    private Date dataPedido;
    
    @OneToOne(cascade = CascadeType.ALL)
    private DetalhesPedido detalhesPedido;

    public Pedido() {
    }

    public Pedido(Cliente cliente, Date dataPedido, DetalhesPedido detalhesPedido) {
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.detalhesPedido = detalhesPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public DetalhesPedido getDetalhesPedido() {
        return detalhesPedido;
    }

    public void setDetalhesPedido(DetalhesPedido detalhesPedido) {
        this.detalhesPedido = detalhesPedido;
    }
    
}
    
