package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PedidoDAO {

    EntityManager em;

    public PedidoDAO(EntityManager em) {
        this.em = em;
    }

    public Pedido registrar(Pedido pedido) throws Exception {
        if (pedido.getId() == null) {
            em.persist(pedido);
        } else {
            throw new Exception("Não foi possível registrar o Pedido!");
        }
        return pedido;
    }

    public Pedido atualizar(Pedido pedido) throws Exception {
        if (em.find(Pedido.class, pedido.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Pedido!");
        } else {
            pedido = em.merge(pedido);
        }
        return pedido;
    }

    public void removerPedido(Long id) throws Exception {
        if (em.find(Pedido.class, id) == null) {
            throw new Exception("Não foi possível atualizar o Pedido!");
        } else {
            Pedido pedido = em.find(Pedido.class, id);
            em.remove(pedido);
        }
    }

    public Pedido consultarPorId(Long id) {
        return em.find(Pedido.class, id);
    }

    public List<Pedido> consultarTodos() {
        Query query = em.createNamedQuery("Pedido.consultarTodos");
        List<Pedido> pedidos = query.getResultList();

        return pedidos;
    }
}
