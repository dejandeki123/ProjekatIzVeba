/*$(document).on("submit", "form", function (event) {           // kada je submitovana forma za kreiranje novog zaposlenog
     event.preventDefault();

    var korisnicko = $("#korisnicko").val();
    var lozinka = $("#lozinka").val();
    var ime = $("#ime").val();
    var prezime = $("#prezime").val();
    var uloga = $("#uloga").val();
    var kontakt_telefon = $("#kontakt_telefon").val();
    var email = $("#email").val();
    var adresa = $("#adresa").val();

    var newKorisnikJSON = formToJSON(korisnicko, lozinka, ime, prezime, uloga, kontakt_telefon, email, adresa);  // pozivamo pomoćnu metodu da kreira JSON

    $.ajax({
        type: "POST",                                               // HTTP metoda je POST
        url: "http://localhost:8082/api/korisnici",                 // URL na koji se šalju podaci
        dataType: "json",                                           // tip povratne vrednosti
        contentType: "application/json",                            // tip podataka koje šaljemo
        data: newKorisnikJSON,                                      // Šaljemo novog korisnika
        success: function () {
            alert(ime + " " + prezime + " je uspešno kreiran kao " + uloga);
            window.location.href = "homepage.html";
        },
        error: function (data) {
            alert(korisnicko + " " + lozinka + " " + ime + " " + prezime + " " + kontakt_telefon  + " " + email + " " + adresa + " nije kreiran kao " + uloga);
        }
    });
});

function formToJSON(korisnickoo, lozinkaa, imee, prezimee, ulogaa, kontaktt, emaill, adresaa) {
    return JSON.stringify({
        "korisnicko": korisnickoo,
        "lozinka": lozinkaa,
        "ime": imee,
        "prezime": prezimee,
        "uloga": ulogaa,
        "kontakt_telefon": kontaktt,
        "email": emaill,
        "adresa": adresaa
    });
}*/