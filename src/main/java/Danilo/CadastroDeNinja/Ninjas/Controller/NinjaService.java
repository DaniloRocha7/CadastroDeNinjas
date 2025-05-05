package Danilo.CadastroDeNinja.Ninjas.Controller;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjarepository) {
        this.ninjaRepository = ninjarepository;
    }

    //Listar todos os meus ninjas
    public List<NinjaModel> listNinjas(){
        return ninjaRepository.findAll();
    }

    //Listar todos os meus ninjas por ID
    public NinjaModel listNinjaById(Long id){
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.orElse(null);
    }

    //Criar um novo ninja
    public NinjaModel generateNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    //Deletar o ninja - Tem que ser um metodo VOID
    public void deleteNinjaById(Long id){
        ninjaRepository.deleteById(id);
    }

    //Atualizar ninja
    public NinjaModel updateNinja(Long id, NinjaModel ninjaUpdate){

        if (ninjaRepository.existsById(id)){
            ninjaUpdate.setId(id);
            return ninjaRepository.save(ninjaUpdate);
        }

        return null;
    }

}
