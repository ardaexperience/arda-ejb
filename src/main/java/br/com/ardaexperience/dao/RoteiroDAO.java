package br.com.ardaexperience.dao;

import br.com.ardaexperience.entidade.Roteiro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RoteiroDAO {

    EntityManager em;

    public RoteiroDAO(EntityManager em) {
        this.em = em;
    }

    public Roteiro registrar(Roteiro roteiro) throws Exception {
        if (roteiro.getId() == null) {
            em.persist(roteiro);
        } else {
            throw new Exception("Não foi possível registrar o Roteiro!");
        }
        return roteiro;
    }

    public Roteiro atualizar(Roteiro roteiro) throws Exception {
        if (em.find(Roteiro.class, roteiro.getId()) == null) {
            throw new Exception("Não foi possível atualizar o Roteiro!");
        } else {
            roteiro = em.merge(roteiro);
        }
        return roteiro;
    }

    public void removerRoteiro(Long id) throws Exception {
        if (em.find(Roteiro.class, id) == null) {
            throw new Exception("Não foi possível atualizar o Roteiro!");
        } else {
            Roteiro roteiro = em.find(Roteiro.class, id);
            em.remove(roteiro);
        }
    }

    public Roteiro consultarPorId(Long id) {
        return em.find(Roteiro.class, id);
    }

    public List<Roteiro> consultarTodos() {

        Query query = em.createNamedQuery("Roteiro.consultarTodos");
        List<Roteiro> roteiro = query.getResultList();

        return roteiro;
    }

}
