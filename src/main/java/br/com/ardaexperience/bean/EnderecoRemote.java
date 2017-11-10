package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.Endereco;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface EnderecoRemote {

    public List<Endereco> consultarTodos();

    public Endereco consultarPorId(Long id);

    public Endereco atualizar(Endereco endereco) throws Exception;

}
