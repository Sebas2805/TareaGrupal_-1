
package com.tareaGrupal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sebastián
 */
@Controller
public class IndexController {
    
    @RequestMapping("/") // URL al que responde
    public String page(Model model) {
        model.addAttribute("NombreProfesor", "Jonathan");
        return "index"; //nombre de la vista en template a mostrar
    }
    
}
