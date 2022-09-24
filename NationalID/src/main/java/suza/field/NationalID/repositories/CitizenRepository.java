package suza.field.NationalID.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import suza.field.NationalID.models.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen,Integer> {

}
