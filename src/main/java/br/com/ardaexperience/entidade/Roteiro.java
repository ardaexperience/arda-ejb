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

@NamedQueries(
        @NamedQuery(name = "Roteiro.consultarTodos", query = "SELECT e FROM Roteiro e")
)

@Entity
public class Roteiro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    @OneToOne(cascade = CascadeType.ALL)
    private DetalhesRoteiro detalhesRoteiro;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToOne(cascade = CascadeType.ALL)
    private Pagina pagina;

    public Roteiro() {
        
    }

    public Roteiro(DetalhesRoteiro detalhesRoteiro, Card card, Pagina pagina) {
        this.detalhesRoteiro = detalhesRoteiro;
        this.card = card;
        this.pagina = pagina;
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }
    
}
