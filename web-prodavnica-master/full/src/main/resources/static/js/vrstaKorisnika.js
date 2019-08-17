$(document).ready(function () {
    var KupacDiv = $(".kupac");
    var DostavljacDiv = $(".dostavljac");
    var AdminDiv = $(".admin");

    KupacDiv.hide();
    DostavljacDiv.hide();
    AdminDiv.hide();

    $.ajax({
        //type: "GET",
        //url: "http://localhost:8080/homepage/",
        //dataType: "json",
        success: function (data) {
            console.log("SUCCESS : ", data);
            var ulogaUlogovanogKorisnika = localStorage.getItem('uloga');
            if (ulogaUlogovanogKorisnika === 'Kupac') {
                KupacDiv.show();
            } else {
                if (ulogaUlogovanogKorisnika === 'Dostavljac') {
                    DostavljacDiv.show();
                } else
                    AdminDiv.show();
            }
        },
        error: function (data) {
            console.log("ERROR : ", data);
        }
    });
});
