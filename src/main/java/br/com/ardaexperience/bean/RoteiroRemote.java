package br.com.ardaexperience.bean;

import br.com.ardaexperience.entidade.Roteiro;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface RoteiroRemote {
    
    public Roteiro registrar(Roteiro roteiro) throws Exception;
    
    public Roteiro atualizar(Roteiro roteiro) throws Exception;
    
    public Roteiro consultarPorId(Long id);
    
    public List<Roteiro> consultarTodos();
    
}
