    package br.com.ardaexperience.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@NamedQueries(
        @NamedQuery(name = "Cliente.consultarTodos", query = "SELECT e FROM Cliente e")
)

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private Usuario usuario;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Contato contato;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "DADOS_PESSOAIS_ID")
    private DadosPessoais dadosPessoais;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "CARTAO_CREDITO_ID")
    private CartaoCredito cartaoCredito;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "CLIENTE_ID")
    private List<Pedido> pedidos;

    public Cliente() {

    }

    public Cliente(DadosPessoais dadosPessoais, Usuario usuario, Contato contato, Endereco endereco, CartaoCredito cartaoCredito, List<Pedido> pedidos) {
        this.dadosPessoais = dadosPessoais;
        this.usuario = usuario;
        this.contato = contato;
        this.endereco = endereco;
        this.cartaoCredito = cartaoCredito;
        this.pedidos = pedidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
