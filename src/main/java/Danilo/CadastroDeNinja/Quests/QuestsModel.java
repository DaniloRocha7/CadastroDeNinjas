package Danilo.CadastroDeNinja.Quests;

import Danilo.CadastroDeNinja.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_quests")
public class QuestsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String difficulty;

    @OneToMany
    private List<NinjaModel> ninjas;


    public  QuestsModel(){}

    public QuestsModel(String name, String difficulty, NinjaModel ninja){
    this.name = name;
    this.difficulty = difficulty;
    };


    public String getName(){
        return name;
    }

    public void  SetName(String name){
        this.name = name;
    }

    public String getDifficulty(){
        return difficulty;
    }

    public void  SetDifficulty(String difficulty){
        this.difficulty = difficulty;
    }



}