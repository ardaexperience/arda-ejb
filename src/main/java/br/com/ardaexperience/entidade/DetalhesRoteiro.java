package br.com.ardaexperience.entidade;

import java.io.Serializable;
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

    private String nome;

    private String TemaFilmeOuSerie;

    private Double custo;

    private Double preco;

    public DetalhesRoteiro() {
    
    }
    
    public DetalhesRoteiro(String nome, String TemaFilmeOuSerie, Double custo, Double preco) {
        this.nome = nome;
        this.TemaFilmeOuSerie = TemaFilmeOuSerie;
        this.custo = custo;
        this.preco = preco;
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

    public String getTemaFilmeOuSerie() {
        return TemaFilmeOuSerie;
    }

    public void setTemaFilmeOuSerie(String TemaFilmeOuSerie) {
        this.TemaFilmeOuSerie = TemaFilmeOuSerie;
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
    
}
