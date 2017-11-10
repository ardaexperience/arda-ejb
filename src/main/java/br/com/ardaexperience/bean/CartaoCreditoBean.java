package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.CartaoCreditoDAO;
import br.com.ardaexperience.entidade.CartaoCredito;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CartaoCreditoBean implements CartaoCreditoRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public List<CartaoCredito> consultarTodos() {
        CartaoCreditoDAO dao = new CartaoCreditoDAO(em);
        return dao.consultarTodos();
    }

    @Override
    public CartaoCredito consultarPorId(Long id) {
        CartaoCreditoDAO dao = new CartaoCreditoDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public CartaoCredito atualizar(CartaoCredito cartaoCredito) throws Exception {
        CartaoCreditoDAO dao = new CartaoCreditoDAO(em);
        return dao.atualizar(cartaoCredito);
    }

}
