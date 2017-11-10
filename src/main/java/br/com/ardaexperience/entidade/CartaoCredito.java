package br.com.ardaexperience.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries(
        @NamedQuery(name = "CartaoCredito.consultarTodos", query = "SELECT e FROM CartaoCredito e")
)

@Entity
@Table(name = "CARTAO_CREDITO")
public class CartaoCredito implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "NOME_CLIENTE", nullable = false)
    private String nomeCliente;
    
    @Column(name = "NUMERO_CARTAO", nullable = false)
    private Long numeroCartao;
    
    @Column(name = "NUMERO_SEGURANCA", nullable = false)
    private int numeroSeguranca;
    
    @Column(name = "MES_EXPIRACAO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date mesExpiracao;
    
    @Column(name = "ANO_EXPIRACAO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date anoExpiracao;

    public CartaoCredito() {
        
    }

    public CartaoCredito(String nomeCliente, Long numeroCartao, 
            int numeroSeguranca, Date mesExpiracao, Date anoExpiracao) {
        this.nomeCliente = nomeCliente;
        this.numeroCartao = numeroCartao;
        this.numeroSeguranca = numeroSeguranca;
        this.mesExpiracao = mesExpiracao;
        this.anoExpiracao = anoExpiracao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getNumeroSeguranca() {
        return numeroSeguranca;
    }

    public void setNumeroSeguranca(int numeroSeguranca) {
        this.numeroSeguranca = numeroSeguranca;
    }

    public Date getMesExpiracao() {
        return mesExpiracao;
    }

    public void setMesExpiracao(Date mesExpiracao) {
        this.mesExpiracao = mesExpiracao;
    }

    public Date getAnoExpiracao() {
        return anoExpiracao;
    }

    public void setAnoExpiracao(Date anoExpiracao) {
        this.anoExpiracao = anoExpiracao;
    }
    
}
