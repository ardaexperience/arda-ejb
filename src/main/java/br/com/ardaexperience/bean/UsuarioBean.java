package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.UsuarioDAO;
import br.com.ardaexperience.entidade.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UsuarioBean implements UsuarioRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public List<Usuario> consultarTodos() {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.consultarTodos();
    }

    @Override
    public Usuario consultarPorId(Long id) {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public Usuario atualizar(Usuario usuario) throws Exception {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.atualizar(usuario);
    }

}
