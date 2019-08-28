package com.example.PrvaTacka.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Korpa implements Serializable{//serijalizacija je predstava objekta iz memorije u nizu bitova 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  

    @Column
    private LocalDateTime datum_kupovine;

    @Column
    private Status status; 

    @OneToOne(mappedBy = "porudzbina",fetch= FetchType.LAZY, cascade=CascadeType.ALL)
    private Dostavljac dostavljac;
  

    @OneToOne(mappedBy = "korpaKupac",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Kupac kupac;
   


    @ManyToMany
    @JoinTable(name= "artikli",
    joinColumns = @JoinColumn(name="korpa_id",referencedColumnName ="id" ),
    inverseJoinColumns = @JoinColumn(name="artikal_id",referencedColumnName ="id" ))
    private Set<Artikal> artikli= new HashSet<>();
   


   public void DodajArtikal(Artikal artikal) {
       this.artikli.add(artikal);
   }

   public Dostavljac getDostavljac() {
       return dostavljac;
   }

   public void setDostavljac(Dostavljac dostavljac) {
       this.dostavljac=dostavljac;
   }

   public Set<Artikal> getArtikli() {
       return artikli;
   }

   public void setArtikli(Set<Artikal> artikli) {
       this.artikli=artikli;
   }

   public Kupac getKupac() {
       return kupac;
   }

   public void setKupac(Kupac kupac) {
       this.kupac=kupac;
   }

   public Long getId() {
       return id;
   }

   public void setId(Long id) {
       this.id=id;
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


  public Korpa(LocalDateTime datum_kupovine,Status status,Dostavljac dostavljac,Kupac kupac,Set<Artikal> artikli) {
      this.datum_kupovine=datum_kupovine;
      this.status=status;
      this.dostavljac=dostavljac;
      this.kupac=kupac;
      this.artikli=artikli;
  }

  public Korpa() {
    
  }
  @Override
    public String toString() {
        return "Korpa { " +
                "id = " + id +
                ", datum kupovine = '" + datum_kupovine + '\'' +
                ", kupac = " + kupac +
                ", dostavljac = " + dostavljac +
                ", status = '" + status + '\'' +
                '}';
    }






    
}