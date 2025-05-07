package Danilo.CadastroDeNinja.Ninjas.Controller;


import Danilo.CadastroDeNinja.Quests.QuestsModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {


    private Long id;
    private String name;
    private String email;
    private String imgUrl;
    private int age;
    private String rank;
    private QuestsModel quests;



}
