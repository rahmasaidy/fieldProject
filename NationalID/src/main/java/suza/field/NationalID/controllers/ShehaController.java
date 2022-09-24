package suza.field.NationalID.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import suza.field.NationalID.models.Citizen;
import suza.field.NationalID.models.Sheha;
import suza.field.NationalID.services.ShehaService;

import java.util.List;

@RequestMapping("/Sheha")
@RestController
public class ShehaController {
    @Autowired
    private ShehaService service;

    @GetMapping
    public List<Sheha>findAllSheha(){
        return service.getShehas();
    }

    @GetMapping("/Sheha/{id}")
    public Sheha findShehaById(@PathVariable int id){
        return service.getShehaById(id);
    }

    @PostMapping
    public Sheha addSheha(@RequestBody Sheha sheha){
        return service.saveSheha(sheha);
    }


    @PutMapping
    public Sheha updaSheha(@RequestBody Sheha newSheha){

        return service.updateSheha(newSheha);
    }

    @DeleteMapping("/Sheha/{id}")
    public String deleteSheha(int id){
        return service.deleteSheha(id);
    }

}
