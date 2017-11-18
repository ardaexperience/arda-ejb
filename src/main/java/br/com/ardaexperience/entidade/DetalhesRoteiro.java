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
        @NamedQuery(name = "DetalhesRoteiro.consultarTodos", query = "SELECT e FROM DetalhesRoteiro e")
)

@Entity
@Table(name = "DETALHES_ROTEIRO")
public class DetalhesRoteiro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double custo;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    private String duracao;

    public DetalhesRoteiro() {

    }

    public DetalhesRoteiro(String nome, Double custo, Double preco, String duracao) {
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
        this.duracao = duracao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
    
}
