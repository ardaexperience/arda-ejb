package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.DetalhesPedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DetalhesPedidoDAO {

    EntityManager em;

    public DetalhesPedidoDAO(EntityManager em) {
        this.em = em;
    }

    public List<DetalhesPedido> consultarTodos() {

        Query query = em.createNamedQuery("DetalhesPedido.consultarTodos");
        List<DetalhesPedido> detalhesPedidos = query.getResultList();

        return detalhesPedidos;
    }

    public DetalhesPedido consultarPorId(Long id) {
        return em.find(DetalhesPedido.class, id);
    }

    public DetalhesPedido atualizar(DetalhesPedido detalhesPedido) throws Exception {
        if (em.find(DetalhesPedido.class, detalhesPedido.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Detalhes do Pedido!");
        } else {
            detalhesPedido = em.merge(detalhesPedido);
        }
        return detalhesPedido;
    }

}
