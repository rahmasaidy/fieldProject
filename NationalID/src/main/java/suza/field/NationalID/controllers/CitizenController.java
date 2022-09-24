package suza.field.NationalID.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import suza.field.NationalID.models.Citizen;
import suza.field.NationalID.services.CitizenService;

import java.util.List;

@RestController
@RequestMapping ("/Citizen")
public class CitizenController {

    @Autowired
    private CitizenService service;

    @GetMapping
    public List<Citizen> findAllCitizen(){
        return service.getCitizens();
    }
    @GetMapping("/Citizen/{id}")
    public Citizen findCitizenById(@PathVariable int id)
    {
        return service.getCitizenById(id);
    }

    @PostMapping
    public  Citizen addCitizen(@RequestBody Citizen citizen){

        return service.saveCitizen(citizen);
    }

    @PutMapping
    public Citizen updateCitizen(@RequestBody Citizen newCitizen){
        return service.updateCitizen(newCitizen);
    }

    @DeleteMapping("/Citizen/{id}")
    public String deleteCitizen(int id){
        return service.deleteCitizen(id);
    }
}
