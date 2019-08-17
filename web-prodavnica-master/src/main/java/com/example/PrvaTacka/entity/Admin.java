package com.example.PrvaTacka.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin") //rekli smo da ovo stavljamo jer 3 tipa korisnika
public class Admin extends Korisnik {
    
}
 
