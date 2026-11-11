package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/feliz")
    public String feliz(){
        return "CEO da Rockstar Games 😊";
    }

    @GetMapping("/triste")
    public String triste(){
        return "Depressivo😒";
    }
}
