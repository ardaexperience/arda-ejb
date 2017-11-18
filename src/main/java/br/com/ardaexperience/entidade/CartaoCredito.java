package br.com.ardaexperience.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
        @NamedQuery(name = "CartaoCredito.consultarTodos", query = "SELECT e "
                + "FROM CartaoCredito e")
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
    private String numeroCartao;
    
    @Column(name = "NUMERO_SEGURANCA", nullable = false)
    private String numeroSeguranca;
    
    @Column(name = "MES_EXPIRACAO", nullable = false)
    private String mesExpiracao;
    
    @Column(name = "ANO_EXPIRACAO", nullable = false)
    private String anoExpiracao;

    public CartaoCredito() {
        
    }

    public CartaoCredito(String nomeCliente, String numeroCartao, 
            String numeroSeguranca, String mesExpiracao, String anoExpiracao) {
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

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroSeguranca() {
        return numeroSeguranca;
    }

    public void setNumeroSeguranca(String numeroSeguranca) {
        this.numeroSeguranca = numeroSeguranca;
    }

    public String getMesExpiracao() {
        return mesExpiracao;
    }

    public void setMesExpiracao(String mesExpiracao) {
        this.mesExpiracao = mesExpiracao;
    }

    public String getAnoExpiracao() {
        return anoExpiracao;
    }

    public void setAnoExpiracao(String anoExpiracao) {
        this.anoExpiracao = anoExpiracao;
    }

}
