package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.Card;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CardDAO {

    EntityManager em;

    public CardDAO(EntityManager em) {
        this.em = em;
    }

    public List<Card> consultarTodos() {
        Query query = em.createNamedQuery("Card.consultarTodos");
        List<Card> cards = query.getResultList();
        return cards;
    }

    public Card consultarPorId(Long id) {
        return em.find(Card.class, id);
    }

    public Card atualizar(Card card) throws Exception {
        if (em.find(Card.class, card.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Card!");
        } else {
            card = em.merge(card);
        }
        return card;
    }

}
