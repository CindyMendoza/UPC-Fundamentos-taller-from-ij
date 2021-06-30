var date = new Date();
var primerDia = new Date(date.getFullYear(), date.getMonth(), 1);
var ultimoDia = new Date(date.getFullYear(), date.getMonth() + 1, 0);
var primerDiaDate, primerDiaMonth, ultimoDiaDate, ultimoDiaMonth;
function validateDate(valDate, varDate) {
    if (valDate < 10) {
        return (varDate = "0" + valDate);
    } else {
        return (varDate = valDate);
    }
}
function validateMonth(valMonth, varMonth) {
    if (valMonth < 10) {
        return (varMonth = "0" + (valMonth+1));
    } else {
        return (varMonth = (valMonth+1));
    }
}
function setDateInLegals() {
    if (document.querySelectorAll("span.date-start")) {
        document.querySelectorAll("span.date-start").forEach((el) => {
            el.innerHTML =
                validateDate(primerDia.getDate(), primerDiaDate) +
                "/" +
                validateMonth(primerDia.getMonth(), primerDiaMonth) +
                "/" +
                primerDia.getFullYear();
        });
    }
    if (document.querySelectorAll("span.date-end")) {
        document.querySelectorAll("span.date-end").forEach((el) => {
            el.innerHTML =
                validateDate(ultimoDia.getDate(), ultimoDiaDate) +
                "/" +
                validateMonth(ultimoDia.getMonth(), ultimoDiaMonth) +
                "/" +
                ultimoDia.getFullYear();
        });
    }
}
setDateInLegals();