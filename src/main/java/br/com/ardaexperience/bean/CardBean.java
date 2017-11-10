package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.CardDAO;
import br.com.ardaexperience.entidade.Card;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CardBean implements CardRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public Card atualizar(Card card) throws Exception {
        CardDAO dao = new CardDAO(em);
        return dao.atualizar(card);
    }

    @Override
    public Card consultarPorId(Long id) {
        CardDAO dao = new CardDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public List<Card> consultarTodos() {
        CardDAO dao = new CardDAO(em);
        return dao.consultarTodos();
    }

}
