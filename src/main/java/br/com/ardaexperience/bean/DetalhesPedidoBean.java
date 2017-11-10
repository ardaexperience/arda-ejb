package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.DetalhesPedidoDAO;
import br.com.ardaexperience.entidade.DetalhesPedido;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DetalhesPedidoBean implements DetalhesPedidoRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public List<DetalhesPedido> consultarTodos() {
        DetalhesPedidoDAO dao = new DetalhesPedidoDAO(em);
        return dao.consultarTodos();
    }

    @Override
    public DetalhesPedido consultarPorId(Long id) {
        DetalhesPedidoDAO dao = new DetalhesPedidoDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public DetalhesPedido atualizar(DetalhesPedido detalhesPedido) throws Exception {
        DetalhesPedidoDAO dao = new DetalhesPedidoDAO(em);
        return dao.atualizar(detalhesPedido);
    }

}
