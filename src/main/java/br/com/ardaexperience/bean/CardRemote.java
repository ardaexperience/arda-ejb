package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.Card;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface CardRemote {

    public Card atualizar(Card card) throws Exception;

    public Card consultarPorId(Long id);

    public List<Card> consultarTodos();
    
}
