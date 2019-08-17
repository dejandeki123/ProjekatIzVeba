package com.example.PrvaTacka.service.impl;

import com.example.PrvaTacka.entity.Admin;
import com.example.PrvaTacka.repository.AdminRepository;
import com.example.PrvaTacka.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    /*@Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin findByKorisnickoAndLozinka(String korisnicko, String lozinka) throws Exception{
        Admin admin = this.adminRepository.findByKorisnickoAndLozinka(korisnicko, lozinka);
        if(admin == null) {
            throw new Exception("Uneseni su pogresni podaci!");
        } else {
            return admin;
        }
    }*/
}
