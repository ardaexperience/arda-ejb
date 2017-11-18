package br.com.ardaexperience.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQueries(
    @NamedQuery(name = "Pagina.consultarTodos", query = "SELECT e FROM Pagina e")
)

@Entity
public class Pagina implements Serializable {
    
    @Id
    private String titulo;
    
    @Column(nullable = false)
    private double avaliacao;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "PAGINA_ID")
    private List<Imagem> imagens;

    @Column(nullable = false)
    private String descricao;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "PAGINA_ID")
    private List<Trajeto> trajetos;
    
    @Column(nullable = false)
    private String clima;
    
    @Column(nullable = false, name = "MOEDA_LOCAL")
    private String moedaLocal;
    
    @Column(nullable = false, name = "FUSO_HORARIO")
    private String fusoHorario;
    
    @Column(nullable = false)
    private String idioma;

    public Pagina() {
    
    }

    public Pagina(double avaliacao, String titulo, List<Imagem> imagens, 
            String descricao, List<Trajeto> trajetos, String clima,
            String moedaLocal, String fusoHorario, String idioma) {
        this.avaliacao = avaliacao;
        this.titulo = titulo;
        this.imagens = imagens;
        this.descricao = descricao;
        this.trajetos = trajetos;
        this.clima = clima;
        this.moedaLocal = moedaLocal;
        this.fusoHorario = fusoHorario;
        this.idioma = idioma;
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

    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Trajeto> getTrajetos() {
        return trajetos;
    }

    public void setTrajetos(List<Trajeto> trajetos) {
        this.trajetos = trajetos;
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}