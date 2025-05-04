package Danilo.CadastroDeNinja.Ninjas.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {


    //C.R.U.D

    // Adicionar Ninja(CREATE)
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Monstrar todos os ninjas (READ)
    @PostMapping("/criar")
    public  String criarNinja(){
        return "Ninja criado";
    }

    //Mostrar todos por ninjas (READ)
    @GetMapping("/todos")
    public String monstrarTodosOsNinjas(){
        return "Mostrar Ninja";
    }

    //Mostrar todos por id (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja por id";
    }

    @PutMapping("/alterar")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por id";
    }

    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }
}
