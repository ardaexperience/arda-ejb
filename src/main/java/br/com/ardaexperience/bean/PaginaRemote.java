package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.Pagina;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface PaginaRemote {

    public Pagina atualizar(Pagina pagina) throws Exception;

    public Pagina consultarPorId(Long id);

    public List<Pagina> consultarTodos();    
}
