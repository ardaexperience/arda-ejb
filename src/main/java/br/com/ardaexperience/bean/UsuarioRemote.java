package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.Usuario;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface UsuarioRemote {
    
    public List<Usuario> consultarTodos();

    public Usuario consultarPorId(Long id);

    public Usuario atualizar(Usuario usuario) throws Exception;
    
}
