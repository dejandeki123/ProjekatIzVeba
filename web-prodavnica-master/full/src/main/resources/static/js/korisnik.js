$(document).on("submit", "form", function(event){

    // da se izbegne izvrsavanja pravog submita forme
    event.preventDefault();

    var email = $("#email").val();
    var lozinka = $("#lozinka").val();

    var myJSON = formToJSON(email, lozinka);

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/api/korisnici",
        dataType: "json",
        contentType: "application/json",
        data: myJSON,
        success: function (data) {
            // data = ulogovani korisnik koji je vratila metoda iz kontrolera
            // mozemo tu vrednost da ispisemo u konzoli
            console.log(data);

            alert(email + " je uspešno ulogovan");
            // postavljamo ulogovanog korisnika na localStorage
            // na isti nacin moze da se postavi i email, username itd.
            localStorage.setItem('uloga', data['uloga']);

            // kasnije u bilo kom js fajlu moze da se dobavi ulogovani korisnik ili njegova uloga na sledeci nacin:
            var ulogaUlogovanogKorisnika = localStorage.getItem('uloga');
            // ispisujemo ulogu u konzoli da bismo potvrdili da je sve u redu
            console.log("Ovo je postavljena uloga ulogovanog korisnika:" + ulogaUlogovanogKorisnika);
            alert("Uloga " + email + " je " + ulogaUlogovanogKorisnika );
            // redirektujemo se na neku drugu stranicu
            window.location.href = "homepage.html";
        },
        error: function (data) {
            console.log(data);
            alert("Greska");
        }
    });
});

function formToJSON(email, lozinka) {
    return JSON.stringify(
        {
            "email": email,
            "lozinka": lozinka
        }
    );
}

$(document).ready(function () {    // Čeka se trenutak kada je DOM(Document Object Model) učitan da bi JS mogao sa njim da manipuliše.
    // ajax poziv
    $.ajax({
        type: "GET",                                                // HTTP metoda
        url: "http://localhost:8080/api/korisnici",                  // URL koji se gađa
        dataType: "json",                                           // tip povratne vrednosti
        success: function (data) {
            console.log("SUCCESS : ", data);                        // ispisujemo u konzoli povratnu vrednost
            for (i = 0; i < data.length; i++) {                     // prolazimo kroz listu svih zaposlenih
                var row = "<tr>";                                   // kreiramo red za tabelu
                row += "<td>" + data[i]['korisnicko'] + "</td>";     // ubacujemo podatke jednog zaposlenog u polja
                row += "<td>" + data[i]['ime'] + "</td>";
                row += "<td>" + data[i]['prezime'] + "</td>";
                row += "<td>" + data[i]['uloga'] + "</td>";
                row += "<td>" + data[i]['kontakt_telefon'] + "</td>";
                row += "<td>" + data[i]['email'] + "</td>";
                row += "<td>" + data[i]['adresa'] + "</td>";

                // kreiramo button i stavljamo idButton = idZaposlenog
                var btn = "<button class='btnSeeMore' id = " + data[i]['id'] + ">See more</button>";
                row += "<td>" + btn + "</td>";                      // ubacujemo button u poslednje polje reda

                $('#korisnici').append(row);                        // ubacujemo kreirani red u tabelu čiji je id = employees
            }
        },
        error: function (data) {
            console.log("ERROR : ", data);
        }
    });
});