package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.DetalhesRoteiro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DetalhesRoteiroDAO {

    EntityManager em;

    public DetalhesRoteiroDAO(EntityManager em) {
        this.em = em;
    }

    public List<DetalhesRoteiro> consultarTodos() {

        Query query = em.createNamedQuery("DetalhesRoteiro.consultarTodos");
        List<DetalhesRoteiro> detalhesRoteiros = query.getResultList();

        return detalhesRoteiros;
    }

    public DetalhesRoteiro consultarPorId(Long id) {
        return em.find(DetalhesRoteiro.class, id);
    }

    public DetalhesRoteiro atualizar(DetalhesRoteiro detalhesRoteiro) throws Exception {
        if (em.find(DetalhesRoteiro.class, detalhesRoteiro.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Detalhes do Roteiro!");
        } else {
            detalhesRoteiro = em.merge(detalhesRoteiro);
        }
        return detalhesRoteiro;
    }

}
