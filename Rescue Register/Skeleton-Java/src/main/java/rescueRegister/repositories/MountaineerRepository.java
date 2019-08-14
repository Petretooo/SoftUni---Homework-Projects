package rescueRegister.repositories;

import rescueRegister.entities.Mountaineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MountaineerRepository extends JpaRepository<Mountaineer,Integer> {
}
