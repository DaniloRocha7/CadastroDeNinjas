package Danilo.CadastroDeNinja.Ninjas.Controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel,Long> {
}