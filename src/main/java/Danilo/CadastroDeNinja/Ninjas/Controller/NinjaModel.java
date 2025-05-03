package Danilo.CadastroDeNinja.Ninjas.Controller;

import Danilo.CadastroDeNinja.Quests.QuestsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


//JPA = Java Persistence API
@Entity
@Table(name = "tb_Cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome")
    private String name;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column(name = "Idade")
    private int age;


    //@ManyToOne - Um ninja tem uma unica missao
    @ManyToMany
    @JoinTable(name = "Quest_id") // forering Key ou chave estrangeira
    private List<QuestsModel> quests;

}

