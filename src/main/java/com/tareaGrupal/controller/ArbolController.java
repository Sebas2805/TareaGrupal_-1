package com.tareaGrupal.controller;

import com.tareaGrupal.domain.Arbol;
import com.tareaGrupal.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/arbol")
public class ArbolController {
    
    @Autowired
    ArbolService arbolService;
    
    @GetMapping("/listado")
    public String listado (Model model) {
        List<Arbol> arboles = arbolService.getArboles(true);
        model.addAttribute("arbol", arboles);
        model.addAttribute("totalArboles", arboles.size());
        return "arbol/listado"; 
    }
    
}
