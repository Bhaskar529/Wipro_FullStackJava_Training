window.onload = function() {
    init();
    alert("Hello!");
 }
  
 function init() {
    document.getElementById("magic").onmouseover = function() {
       this.className = "highlightMouseover";
    }
    document.getElementById("magic").onmouseout = function() {
       this.className = "";
    }
    document.getElementById("magic").onclick = function() {
        this.className = "highlightClick";
     }
 }