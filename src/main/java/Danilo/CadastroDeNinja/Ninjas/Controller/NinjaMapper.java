package Danilo.CadastroDeNinja.Ninjas.Controller;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO){

        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setName(ninjaDTO.getName());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl());
        ninjaModel.setAge(ninjaDTO.getAge());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setQuests(ninjaDTO.getQuests());

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel){

        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setName(ninjaDTO.getName());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl());
        ninjaModel.setAge(ninjaDTO.getAge());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setQuests(ninjaDTO.getQuests());

        return ninjaDTO;
    }

}
