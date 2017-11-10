package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioDAO {
    
     EntityManager em;

    public UsuarioDAO(EntityManager em) {
        this.em = em;
    }

    public List<Usuario> consultarTodos() {
        Query query = em.createNamedQuery("Usuario.consultarTodos");
        List<Usuario> usuarios = query.getResultList();
        return usuarios;
    }

    public Usuario consultarPorId(Long id) {
        return em.find(Usuario.class, id);
    }

    public Usuario atualizar(Usuario usuario) throws Exception {
        if (em.find(Usuario.class, usuario.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Usuario!");
        } else {
            usuario = em.merge(usuario);
        }
        return usuario;
    }
    
}
