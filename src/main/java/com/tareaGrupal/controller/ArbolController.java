package com.tareaGrupal.controller;

import com.tareaGrupal.domain.Arbol;
import com.tareaGrupal.service.ArbolService;
import com.tareaGrupal.service.Impl.FirebaseStorageServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/arbol")
public class ArbolController {
    
    @Autowired
    ArbolService arbolService;
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @GetMapping("/listado")
    public String listado (Model model) {
        List<Arbol> arboles = arbolService.getArboles();
        model.addAttribute("arboles", arboles);
        model.addAttribute("totalArboles", arboles.size());
        return "arbol/listado"; 
    }
    
    @GetMapping("/nuevo")
    public String arbolNuevo(Arbol arbol) {
        return "/arbol/modifica";
    }
    
    @PostMapping("/guardar")
    public String arbolGuardar(Arbol arbol,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            arbolService.save(arbol);
            arbol.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "arbol", 
                            arbol.getIdArbol()));
        }
        arbolService.save(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/eliminar/{idArbol}")
    public String arbolEliminar(Arbol arbol) {
        arbolService.delete(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/modificar/{idArbol}")
    public String arbolModificar(Arbol arbol, Model model) {
        arbol = arbolService.getArboles(arbol);
        model.addAttribute("arbol", arbol);
        return "/arbol/modifica";
    }
}
