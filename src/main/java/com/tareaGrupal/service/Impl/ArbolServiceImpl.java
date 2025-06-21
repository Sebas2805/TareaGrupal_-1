package com.tareaGrupal.service.Impl;

import com.tareaGrupal.dao.ArbolDao;
import com.tareaGrupal.domain.Arbol;
import com.tareaGrupal.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbolServiceImpl implements ArbolService{

    @Autowired
    private ArbolDao arbolDao;
    
    @Override
    public List<Arbol> getArboles(boolean activos) {
        List<Arbol> lista = arbolDao.findAll();
        return lista;
    }
    
}
