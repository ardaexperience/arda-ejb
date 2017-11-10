package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.Pagina;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PaginaDAO {

    EntityManager em;

    public PaginaDAO(EntityManager em) {
        this.em = em;
    }

    public List<Pagina> consultarTodos() {

        Query query = em.createNamedQuery("Pagina.consultarTodos");
        List<Pagina> paginas = query.getResultList();

        return paginas;
    }

    public Pagina consultarPorId(Long id) {
        return em.find(Pagina.class, id);
    }

    public Pagina atualizar(Pagina pagina) throws Exception {
        if (em.find(Pagina.class, pagina.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Pagina!");
        } else {
            pagina = em.merge(pagina);
        }
        return pagina;
    }

}
