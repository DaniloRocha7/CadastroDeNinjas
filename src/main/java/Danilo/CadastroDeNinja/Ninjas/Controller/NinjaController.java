package Danilo.CadastroDeNinja.Ninjas.Controller;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService ninjaService;


    //C.R.U.D

    // Adicionar Ninja(CREATE)
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Monstrar todos os ninjas (READ)
    @PostMapping("/criar")
    public List<NinjaModel> listNinjas(){
        return ninjaService.listNinjas();
    }

    //Mostrar todos por ninjas (READ)
    @GetMapping("/All")
    public String showAllNinja(){
        return "Show Ninja";
    }

    //Mostrar todos por id (READ)
    @GetMapping("/all")
    public String showAllNinjasById(){
        return "Show Ninja by id";
    }

    @PutMapping("/modify")
    public String modifyNinjaById(){
        return "modify Ninja by id";
    }

    @DeleteMapping("/delete")
    public String deleteNinjaById(){
        return "Ninja delete by id";
    }
}
