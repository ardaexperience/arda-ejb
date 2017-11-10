package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.Contato;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ContatoDAO {

    EntityManager em;

    public ContatoDAO(EntityManager em) {
        this.em = em;
    }

    public List<Contato> consultarTodos() {
        Query query = em.createNamedQuery("Contato.consultarTodos");
        List<Contato> contatos = query.getResultList();
        return contatos;
    }

    public Contato consultarPorId(Long id) {
        return em.find(Contato.class, id);
    }

    public Contato atualizar(Contato contato) throws Exception {
        if (em.find(Contato.class, contato.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Contato!");
        } else {
            contato = em.merge(contato);
        }
        return contato;
    }

}
