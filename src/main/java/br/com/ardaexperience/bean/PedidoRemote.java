package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.Pedido;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface PedidoRemote {

    public Pedido registrar(Pedido pedido) throws Exception;

    public void removerPedido(Long id) throws Exception;    
    
    public Pedido atualizar(Pedido pedido) throws Exception;

    public Pedido consultarPorId(Long id);

    public List<Pedido> consultarTodos();
}
