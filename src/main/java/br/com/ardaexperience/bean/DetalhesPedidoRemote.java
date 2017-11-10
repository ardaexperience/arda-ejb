package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.DetalhesPedido;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface DetalhesPedidoRemote {

    public List<DetalhesPedido> consultarTodos();

    public DetalhesPedido consultarPorId(Long id);

    public DetalhesPedido atualizar(DetalhesPedido detalhesPedido) throws Exception;
    
}
