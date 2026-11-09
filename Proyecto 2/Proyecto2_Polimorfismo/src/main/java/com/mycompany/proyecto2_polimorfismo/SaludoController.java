package com.mycompany.proyecto2_polimorfismo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SaludoController {

    @GetMapping("/saludo") 
    public String mostrarSaludo(Model model) {
        
        Animal miMascota = new Perro("Tom");
        
        
        miMascota.hacerSonido(); 
        
        model.addAttribute("mensaje", "Hola desde el controlador");
        model.addAttribute("nombreMascota", miMascota.getNombre());
        
        return "Saludo"; 
    }
}