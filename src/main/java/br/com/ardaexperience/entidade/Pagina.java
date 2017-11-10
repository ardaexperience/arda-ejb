package br.com.ardaexperience.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries(
    @NamedQuery(name = "Pagina.consultarTodos", query = "SELECT e FROM Pagina e")
)

@Entity
public class Pagina implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double avaliacao;
    private String titulo;
    private String imagens;
    private String descricao;
    private String trajeto;
    private String clima;
    private String moedaLocal;
    private String fusoHorario;
    private String idiomaNatio;

    public Pagina() {
    
    }

    public Pagina(double avaliacao, String titulo, String imagens,
            String descricao, String trajeto, String clima, String moedaLocal,
            String fusoHorario, String idiomaNatio) {
        this.avaliacao = avaliacao;
        this.titulo = titulo;
        this.imagens = imagens;
        this.descricao = descricao;
        this.trajeto = trajeto;
        this.clima = clima;
        this.moedaLocal = moedaLocal;
        this.fusoHorario = fusoHorario;
        this.idiomaNatio = idiomaNatio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTrajeto() {
        return trajeto;
    }

    public void setTrajeto(String trajeto) {
        this.trajeto = trajeto;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getMoedaLocal() {
        return moedaLocal;
    }

    public void setMoedaLocal(String moedaLocal) {
        this.moedaLocal = moedaLocal;
    }

    public String getFusoHorario() {
        return fusoHorario;
    }

    public void setFusoHorario(String fusoHorario) {
        this.fusoHorario = fusoHorario;
    }

    public String getIdiomaNatio() {
        return idiomaNatio;
    }

    public void setIdiomaNatio(String idiomaNatio) {
        this.idiomaNatio = idiomaNatio;
    }
    
}