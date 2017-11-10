package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.CartaoCredito;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CartaoCreditoDAO {

    EntityManager em;

    public CartaoCreditoDAO(EntityManager em) {
        this.em = em;
    }

    public List<CartaoCredito> consultarTodos() {
        Query query = em.createNamedQuery("CartaoCredito.consultarTodos");
        List<CartaoCredito> cartaoCredito = query.getResultList();
        return cartaoCredito;
    }

    public CartaoCredito consultarPorId(Long id) {
        return em.find(CartaoCredito.class, id);
    }

    public CartaoCredito atualizar(CartaoCredito cartaoCredito) throws Exception {
        if (em.find(CartaoCredito.class, cartaoCredito.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Cartão de Crédito!");
        } else {
            cartaoCredito = em.merge(cartaoCredito);
        }
        return cartaoCredito;
    }

}
