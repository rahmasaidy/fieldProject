package suza.field.NationalID.services;

import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import suza.field.NationalID.models.Sheha;
import suza.field.NationalID.repositories.ShehaRepositoty;

import java.util.List;


@Service
public class ShehaService {

    @Autowired
    public ShehaRepositoty repositoty;


//   Post Service
  public Sheha saveSheha(Sheha sheha){
      return repositoty.save(sheha);

  }
  public List<Sheha> saveShehas(List<Sheha>shehas){
      return repositoty.saveAll(shehas);
  }

    //  Get service
  public List<Sheha>getShehas(){
      return repositoty.findAll();
  }

  public Sheha getShehaById(Integer id){
      return repositoty.findById(id).orElse(null);
  }


  //    Delete service
  public String deleteSheha(int id){
      repositoty.deleteById(id);
      return "Sheha was deleted!!"+id;
  }

    //   Put Service
  public Sheha updateSheha(Sheha newSheha){
      Sheha existingSheha = repositoty.findById(newSheha.getId()).orElse(null);
      existingSheha.setFirstName(newSheha.getFirstName());
      existingSheha.setLastName(newSheha.getLastName());
      existingSheha.setAddress(newSheha.getAddress());
      existingSheha.setPhoneNo(newSheha.getPhoneNo());
      existingSheha.setDate_of_Birth(newSheha.getDate_of_Birth());
      existingSheha.setShehiaName(newSheha.getShehiaName());
      existingSheha.setStatus(newSheha.getStatus());

      return repositoty.save(existingSheha);
  }
}
