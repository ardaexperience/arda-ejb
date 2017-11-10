package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.EnderecoDAO;
import br.com.ardaexperience.entidade.Endereco;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EnderecoBean implements EnderecoRemote {

    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;
    
    @Override
    public List<Endereco> consultarTodos() {
        EnderecoDAO dao = new EnderecoDAO(em);
        return dao.consultarTodos();
    }

    @Override
    public Endereco consultarPorId(Long id) {
        EnderecoDAO dao = new EnderecoDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public Endereco atualizar(Endereco endereco) throws Exception {
        EnderecoDAO dao = new EnderecoDAO(em);
        return dao.atualizar(endereco);
    }

}
