package suza.field.NationalID.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import suza.field.NationalID.models.Citizen;
import suza.field.NationalID.repositories.CitizenRepository;
import javax.persistence.Id;
import java.util.List;


@Service
public class CitizenService {
    @Autowired
    public CitizenRepository repository;

//    Post Service
    public Citizen saveCitizen(Citizen citizen){
        return  repository.save(citizen);
    }
    public List<Citizen> saveCitizens(List<Citizen> citizens){
        return  repository.saveAll(citizens);
    }

//    Get service
    public List<Citizen>getCitizens(){

        return repository.findAll();
    }
    public Citizen getCitizenById(Integer id){

        return repository.findById(id).orElse(null);
    }

//    Delete service
    public String deleteCitizen(int id){
        repository.deleteById(id);
        return "One object has deleted!!"+id;
    }

//   Put Service
    public  Citizen updateCitizen(Citizen newCitizen){
        Citizen existingCitizen = repository.findById(newCitizen.getId()).orElse(null);
        existingCitizen.setFName(newCitizen.getFName());
        existingCitizen.setLName(newCitizen.getLName());
        existingCitizen.setHouseNo(newCitizen.getHouseNo());
        existingCitizen.setGender(newCitizen.getGender());
        existingCitizen.setDateOfBirth(newCitizen.getDateOfBirth());
        existingCitizen.setPhoneNo(newCitizen.getPhoneNo());
        return repository.save(existingCitizen);
    }

}
