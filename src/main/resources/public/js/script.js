var URL = 'https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=';
var compl = '&interval=5min&apikey=demo';

function loadGetMsg() {
    let nameVar = document.getElementById("name").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("getrespmsg").innerHTML = 
                this.responseText;
    }
    xhttp.open("GET", URL +nameVar+ compl);
    xhttp.send();
}

function weekly(){
    URL = 'https://www.alphavantage.co/query?function=TIME_SERIES_WEEKLY&symbol=';
    compl = '&apikey=demo';
    
}

function monthly(){
    URL = 'https://www.alphavantage.co/query?function=TIME_SERIES_MONTHLY&symbol=';
    compl = '&apikey=demo';
}

function daily(){
    URL = 'https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=';
    compl = '&apikey=demo';
}

function intraday(){
    URL = 'https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=';
    compl = '&interval=5min&apikey=demo';
}