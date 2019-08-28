package com.example.PrvaTacka.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin") 
public class Admin extends Korisnik {
    
}
 
