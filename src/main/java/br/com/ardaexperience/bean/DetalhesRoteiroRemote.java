package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.DetalhesRoteiro;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface DetalhesRoteiroRemote {

    public List<DetalhesRoteiro> consultarTodos();

    public DetalhesRoteiro consultarPorId(Long id);

    public DetalhesRoteiro atualizar(DetalhesRoteiro detalhesRoteiro) throws Exception;

}
