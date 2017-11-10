package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.PaginaDAO;
import br.com.ardaexperience.entidade.Pagina;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PaginaBean implements PaginaRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public Pagina atualizar(Pagina pagina) throws Exception {
        PaginaDAO dao = new PaginaDAO(em);
        return dao.atualizar(pagina);
    }

    @Override
    public Pagina consultarPorId(Long id) {
        PaginaDAO dao = new PaginaDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public List<Pagina> consultarTodos() {
        PaginaDAO dao = new PaginaDAO(em);
        return dao.consultarTodos();
    }

}
