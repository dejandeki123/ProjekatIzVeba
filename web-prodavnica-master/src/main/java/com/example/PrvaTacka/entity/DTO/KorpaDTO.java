package com.example.PrvaTacka.entity.DTO;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.example.PrvaTacka.entity.Artikal;
import com.example.PrvaTacka.entity.Dostavljac;
import com.example.PrvaTacka.entity.Kupac;
import com.example.PrvaTacka.entity.Status;

public class KorpaDTO{
   public Long id; //valjda id korisnika
   private LocalDateTime datum_kupovine; //treba nam datum  kupovine zbog izvestaja
   private Status status; ///treba nam status neke porudzbine
   public Dostavljac dostavljac;

   private Kupac kupac; ///treba nam kupac koji ce da stavlja proizvode u korpu

   private Set<Artikal> artikli=new HashSet<>();
   //skup artikala koje korisnik ubaci u korpu

   public KorpaDTO(Long id,LocalDateTime datum_kupovine,Status status,Dostavljac dostavljac,Kupac kupac,Set<Artikal> artikli) {
       this.id=id;
       this.datum_kupovine=datum_kupovine;
       this.status=status;
       this.dostavljac=dostavljac;
       this.kupac=kupac;
       this.artikli=artikli;
   }//konstruktor sa parametrima sa skupom artikala u korpi

   public KorpaDTO(Long id,LocalDateTime datum_kupovine,Status status,Dostavljac dostavljac,Kupac kupac) {
    this.id=id;
    this.datum_kupovine=datum_kupovine;
    this.status=status;
    this.dostavljac=dostavljac;
    this.kupac=kupac;
 //konstruktor sa parametrima za praznu korpu
}

public Kupac getKupac() {
    return kupac;
}

public void setKupac(Kupac kupac) {
    this.kupac = kupac;
}

public Set<Artikal> getArtikli() {
    return artikli;
}

public void setArtikli(Set<Artikal> artikli) {
    this.artikli = artikli;
}

public KorpaDTO() {
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public LocalDateTime getDatum_kupovine() {
    return datum_kupovine;
}

public void setDatum_kupovine(LocalDateTime datum_kupovine) {
    this.datum_kupovine = datum_kupovine;
}

public Status getStatus() {
    return status;
}

public void setStatus(Status status) {
    this.status = status;
}

public Dostavljac getDostavljac() {
    return dostavljac;
}

public void setDostavljac(Dostavljac dostavljac) {
    this.dostavljac = dostavljac;
}





}