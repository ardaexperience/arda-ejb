package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.Endereco;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class EnderecoDAO {

    EntityManager em;

    public EnderecoDAO(EntityManager em) {
        this.em = em;
    }

    public List<Endereco> consultarTodos() {
        Query query = em.createNamedQuery("Endereco.consultarTodos");
        List<Endereco> enderecos = query.getResultList();
        return enderecos;
    }

    public Endereco consultarPorId(Long id) {
        return em.find(Endereco.class, id);
    }

    public Endereco atualizar(Endereco endereco) throws Exception {
        if (em.find(Endereco.class, endereco.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Endereço!");
        } else {
            endereco = em.merge(endereco);
        }
        return endereco;
    }

}
