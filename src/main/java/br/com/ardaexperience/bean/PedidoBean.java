package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.PedidoDAO;
import br.com.ardaexperience.entidade.Pedido;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PedidoBean implements PedidoRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public Pedido registrar(Pedido pedido) throws Exception {
        PedidoDAO dao = new PedidoDAO(em);
        return dao.registrar(pedido);
    }

    @Override
    public void removerPedido(Long id) throws Exception {
        PedidoDAO dao = new PedidoDAO(em);
        dao.removerPedido(id);
    }

    @Override
    public Pedido atualizar(Pedido pedido) throws Exception {
        PedidoDAO dao = new PedidoDAO(em);
        return dao.atualizar(pedido);
    }

    @Override
    public Pedido consultarPorId(Long id) {
        PedidoDAO dao = new PedidoDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public List<Pedido> consultarTodos() {
        PedidoDAO dao = new PedidoDAO(em);
        return dao.consultarTodos();
    }

}
