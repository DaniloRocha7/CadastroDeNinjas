package Danilo.CadastroDeNinja.Ninjas.Controller;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
   }




    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    //C.R.U.D
    // Adicionar Ninja(CREATE)
    @PostMapping("/criar")
    public NinjaDTO generateNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.generateNinja(ninja);

    }

    //Mostrar todos por ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listNinjas(){
        return ninjaService.listNinjas();
    }

    //Mostrar ninja por id (READ)
    @GetMapping("/list/{id}")
    public NinjaModel listNinjasById(@PathVariable Long id){
    return ninjaService.listNinjaById(id);

    }

    @PutMapping("/Atualizar")
    public NinjaModel updateNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaUpdate){
        return ninjaService.updateNinja(id, ninjaUpdate);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteNinjaById(@PathVariable Long id){
       ninjaService.deleteNinjaById(id);
    }
}
