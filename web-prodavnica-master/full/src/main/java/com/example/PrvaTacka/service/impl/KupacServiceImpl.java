package com.example.PrvaTacka.service.impl;

import com.example.PrvaTacka.entity.Kupac;
import com.example.PrvaTacka.repository.KupacRepository;
import com.example.PrvaTacka.service.KupacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KupacServiceImpl implements KupacService {
    /*@Autowired
    private KupacRepository kupacRepository;

    @Override
    public Kupac create(Kupac kupac) throws Exception {
        if(kupac.getId() != null) {
            throw new Exception("ID must be null!");
        }

        if(kupac.getKorisnicko() != null) {
            throw new Exception("Korisnicko ime vec postoji!");
        }
        return this.kupacRepository.save(kupac);
    }

    @Override
    public List<Kupac> findAll() {
        return this.kupacRepository.findAll();
    }

    @Override
    public Kupac findOne(Long id) {
        return this.kupacRepository.getOne(id);
    }

    @Override
    public Kupac findByKorisnickoAndLozinka(String korisnicko, String lozinka) throws Exception{
        Kupac kupac = this.kupacRepository.findByKorisnickoAndLozinka(korisnicko, lozinka);
        if(kupac == null) {
            throw new Exception("Uneseni su pogresni podaci!");
        } else {
            return kupac;
        }
    }

    @Override
    public void change(Long id) {
        Kupac kupac = kupacRepository.getOne(id);
        kupac.setUloga("Dostavljac");
        kupacRepository.save(kupac);
    }

    @Override
    public void delete(long id) {
        kupacRepository.deleteById(id);
    }*/
}
