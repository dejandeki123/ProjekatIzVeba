INSERT INTO KORPA (datum_kupovine, status) VALUES (now(), 2);
INSERT INTO KORPA (datum_kupovine, status) VALUES (now(), 1);
INSERT INTO KORPA (datum_kupovine, status) VALUES (now(), 4);

INSERT INTO ARTIKAL (naziv, opis, cena, kolicina, kategorija, korpa_artikli_id) VALUES ('Farmerke', '90% Pamuk, 10% Elastan', 2299, 20, 'Farmerke', 1);
INSERT INTO ARTIKAL (naziv, opis, cena, kolicina, kategorija, korpa_artikli_id) VALUES ('Haljina', '100% Pamuk', 1699, 13, 'Haljina', 2);
INSERT INTO ARTIKAL (naziv, opis, cena, kolicina, kategorija, korpa_artikli_id) VALUES ('Bluza', '100% Viskoza', 1199, 24, 'Bluza', 3);

INSERT INTO KORISNIK (korisnicko, lozinka, ime, prezime,uloga, kontakt_telefon, email, adresa, tip) VALUES ('danka.l', 'lozinka', 'Danka', 'Lalic', 'Admin', 0615649023, 'danka.l@gmail.com', 'Zrenjanin', 'admin');
INSERT INTO KORISNIK (korisnicko, lozinka, ime, prezime,uloga, kontakt_telefon, email, adresa, tip) VALUES ('marko.v', 'lozinka2', 'Marko', 'Vladisavljev', 'Kupac', 0642387639, 'marko.v@gmail.com', 'Novi Sad', 'kupac');
INSERT INTO KORISNIK (korisnicko, lozinka, ime, prezime,uloga, kontakt_telefon, email, adresa, tip) VALUES ('jelena.h', 'lozinka3', 'Jelena', 'Heslenji', 'Kupac', 0638962613, 'jelena.h@gmail.com', 'Novi Sad', 'kupac');
INSERT INTO KORISNIK (korisnicko, lozinka, ime, prezime,uloga, kontakt_telefon, email, adresa, tip) VALUES ('aleksandar.m', 'lozinka4', 'Aleksandar', 'Milanov', 'Kupac', 0628325690, 'aleksandar.m@gmail.com', 'Zrenjanin', 'kupac');