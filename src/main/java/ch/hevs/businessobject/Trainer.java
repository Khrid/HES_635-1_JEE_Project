package ch.hevs.businessobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Trainer extends Person {

    @Column(name="diplomType")
    private String diplomType;

    @Column(name="role")
    private String role;


    public Trainer(){}

    public Trainer(String lastname, String firstname, Date dateOfBirth, Team currentTeam, Country nationality,
                   String diplomType, String role){
        super(lastname, firstname, dateOfBirth, currentTeam, nationality);
        this.diplomType=diplomType;
        this.role=role;
    }


    public String getDiplomType() {
        return diplomType;
    }

    public void setDiplomType(String diplomType) {
        this.diplomType = diplomType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
