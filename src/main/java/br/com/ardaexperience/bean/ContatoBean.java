package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.ContatoDAO;
import br.com.ardaexperience.entidade.Contato;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ContatoBean implements ContatoRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public List<Contato> consultarTodos() {
        ContatoDAO dao = new ContatoDAO(em);
        return dao.consultarTodos();
    }

    @Override
    public Contato consultarPorId(Long id) {
        ContatoDAO dao = new ContatoDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public Contato atualizar(Contato contato) throws Exception {
        ContatoDAO dao = new ContatoDAO(em);
        return dao.atualizar(contato);
    }

}
