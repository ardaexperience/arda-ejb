package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.Contato;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ContatoRemote {

    public List<Contato> consultarTodos();

    public Contato consultarPorId(Long id);

    public Contato atualizar(Contato contato) throws Exception;

}
