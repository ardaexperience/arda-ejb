package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.RoteiroDAO;
import br.com.ardaexperience.entidade.Roteiro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RoteiroBean implements RoteiroRemote {
    
    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public Roteiro registrar(Roteiro roteiro) throws Exception {
        RoteiroDAO dao = new RoteiroDAO(em);
        return dao.registrar(roteiro);
    }

    @Override
    public Roteiro atualizar(Roteiro roteiro) throws Exception {
        RoteiroDAO dao = new RoteiroDAO(em);
        return dao.atualizar(roteiro);
    }

    @Override
    public Roteiro consultarPorId(Long id) {
        RoteiroDAO dao = new RoteiroDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public List<Roteiro> consultarTodos() {
        RoteiroDAO dao = new RoteiroDAO(em);
        return dao.consultarTodos();
    }
    
}
