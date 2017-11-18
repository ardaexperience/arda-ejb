package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.ClienteDAO;
import br.com.ardaexperience.entidade.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClienteBean implements ClienteRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public Cliente registrar(Cliente cliente) throws Exception {
        ClienteDAO dao = new ClienteDAO(em);
        return dao.registrar(cliente);
    }

    @Override
    public Cliente consultarPorId(Long id) {
        ClienteDAO dao = new ClienteDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public Cliente atualizar(Cliente cliente) throws Exception {
        ClienteDAO dao = new ClienteDAO(em);
        return dao.atualizar(cliente);
    }

    @Override
    public List<Cliente> consultarTodos() {
        ClienteDAO dao = new ClienteDAO(em);
        return dao.consultarTodos();
    }

    @Override
    public Object validar(String usuario, String senha) {
        ClienteDAO dao = new ClienteDAO(em);
        return dao.validar(usuario, senha);
    }
}
