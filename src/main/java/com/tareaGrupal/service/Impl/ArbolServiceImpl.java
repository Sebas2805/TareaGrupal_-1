package com.tareaGrupal.service.Impl;

import com.tareaGrupal.dao.ArbolDao;
import com.tareaGrupal.domain.Arbol;
import com.tareaGrupal.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArbolServiceImpl implements ArbolService{

    @Autowired
    private ArbolDao arbolDao;
    
    @Override
    public List<Arbol> getArboles() {
        List<Arbol> lista = arbolDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Arbol getArboles(Arbol arbol) {
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {
        arbolDao.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Arbol arbol) {
        arbolDao.deleteById(arbol.getIdArbol());
    }
}
