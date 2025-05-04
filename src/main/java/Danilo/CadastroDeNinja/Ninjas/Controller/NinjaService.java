package Danilo.CadastroDeNinja.Ninjas.Controller;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjarepository;

    public NinjaService(NinjaRepository ninjarepository) {
        this.ninjarepository = ninjarepository;
    }

    //Listar todos os meus ninjas
    public List<NinjaModel> listNinjas(){
        return ninjarepository.findAll();
    }
}
