package ma.emsi.tpgrpcbanque.repository;

import ma.emsi.tpgrpcbanque.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

    List<Compte> findByType(String type);

}
