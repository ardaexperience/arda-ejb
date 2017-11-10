package br.com.ardaexperience.bean;

import br.com.ardaexperience.dao.DetalhesRoteiroDAO;
import br.com.ardaexperience.entidade.DetalhesRoteiro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DetalhesRoteiroBean implements DetalhesRoteiroRemote {
    
    @PersistenceContext(name = "ArdaPU")
    private EntityManager em;

    @Override
    public List<DetalhesRoteiro> consultarTodos() {
        DetalhesRoteiroDAO dao = new DetalhesRoteiroDAO(em);
        return dao.consultarTodos();
    }

    @Override
    public DetalhesRoteiro consultarPorId(Long id) {
        DetalhesRoteiroDAO dao = new DetalhesRoteiroDAO(em);
        return dao.consultarPorId(id);
    }

    @Override
    public DetalhesRoteiro atualizar(DetalhesRoteiro detalhesRoteiro) throws Exception {
        DetalhesRoteiroDAO dao = new DetalhesRoteiroDAO(em);
        return dao.atualizar(detalhesRoteiro);
    }
    
}
