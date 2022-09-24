package suza.field.NationalID.models;


import lombok.Data;

import javax.persistence.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fName;
    private String lName;
    private String houseNo;
    private String gender;
    private Date DateOfBirth;
    private int phoneNo;

//    private List<suza.field.NationalID.models.Citizen> citizen;
//    @OneToMany
//    public List< Citizen > Citizen =citizen;



}
