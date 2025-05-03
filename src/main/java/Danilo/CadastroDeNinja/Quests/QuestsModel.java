package Danilo.CadastroDeNinja.Quests;

import Danilo.CadastroDeNinja.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_quests")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class QuestsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String difficulty;

    @OneToMany
    private List<NinjaModel> ninjas;

}