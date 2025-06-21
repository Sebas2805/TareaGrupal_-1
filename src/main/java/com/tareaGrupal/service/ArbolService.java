package com.tareaGrupal.service;

import com.tareaGrupal.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    public List<Arbol> getArboles (boolean activos);
}
