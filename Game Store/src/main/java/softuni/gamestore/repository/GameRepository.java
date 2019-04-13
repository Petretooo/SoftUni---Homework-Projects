package softuni.gamestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuni.gamestore.entity.Game;

public interface GameRepository extends JpaRepository<Game,Integer> {

}
