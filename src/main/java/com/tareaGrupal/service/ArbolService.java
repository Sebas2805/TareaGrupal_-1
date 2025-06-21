package com.tareaGrupal.service;

import com.tareaGrupal.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    public List<Arbol> getArboles();
    
    public Arbol getArboles(Arbol arbol);
    
    public void save(Arbol arbol);
    
    public void delete(Arbol arbol);
}
