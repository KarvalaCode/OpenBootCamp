let map, marker1, marker2, marker3;

function initMap(){
    map = new google.maps.Map(document.getElementById("map"), {
        center: {lat: 48.09218788684593, lng: -1.4343428267099643},
        zoom: 4
      });
    
    marker1 = new google.maps.Marker({
        position: {lat: 65.72183647249388, lng: -18.09460505313907},
        map: map,
      });
    
    marker2 = new google.maps.Marker({
        position: {lat: 41.95505809611576, lng: 2.9039995269462713},
        map: map,
      });
    
    marker3 = new google.maps.Marker({
        position: {lat: 43.93120915168901, lng: 11.235644916875746},
        map: map,
      });   
}  
window.initMap = initMap;
