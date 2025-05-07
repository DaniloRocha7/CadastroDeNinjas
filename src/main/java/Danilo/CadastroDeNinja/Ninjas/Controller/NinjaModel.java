package Danilo.CadastroDeNinja.Ninjas.Controller;

import Danilo.CadastroDeNinja.Quests.QuestsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
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

    @Column(name="rank")
    private String rank;

    @Column(name = "Idade")
    private int age;


    //@ManyToOne - Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "Quest_id") // forering Key ou chave estrangeira
    private QuestsModel quests;

}

