package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.CartaoCredito;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface CartaoCreditoRemote {

    public List<CartaoCredito> consultarTodos();

    public CartaoCredito consultarPorId(Long id);

    public CartaoCredito atualizar(CartaoCredito cartaoCredito) throws Exception;

}
