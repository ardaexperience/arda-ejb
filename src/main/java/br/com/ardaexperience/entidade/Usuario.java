package br.com.ardaexperience.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
        @NamedQuery(name = "Usuario.consultarTodos", query = "SELECT e FROM Usuario e"),
        @NamedQuery(name = "Usuario.validar", query = "SELECT e FROM Usuario e "
                + "WHERE e.usuario = :usuario AND e.senha = :senha")
})

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String usuario;
    
    @Column(nullable = false)
    private String senha;
    
    @Column(nullable = false, name = "CATEGORIA_ACESSO")
    private String categoriaAcesso;

    public Usuario() {
   
    }

    public Usuario(String nome, String usuario, String senha, String categoriaAcesso) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.categoriaAcesso = categoriaAcesso;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCategoriaAcesso() {
        return categoriaAcesso;
    }

    public void setCategoriaAcesso(String categoriaAcesso) {
        this.categoriaAcesso = categoriaAcesso;
    }
    
}
