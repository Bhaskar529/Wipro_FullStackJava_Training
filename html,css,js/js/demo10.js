window.onload = init;

function init() {
   document.getElementById("btn1").onclick = changeHeading1;
   document.getElementById("btn2").onclick = changeHeading2;
   document.getElementById("btn3").onclick = changeParagraph;
}

function changeHeading1() {
    
    //document.getElementById("heading1").innerHTML = "hello";

        //same as given below, the below approach is recommended
        //replace innerHTML with textContent

   const elm = document.getElementById("heading1");  // id is unique
   elm.textContent = "hello";

//    console.log(elm.textContent);
   // Create a new element and insert after h1
   const newElm = document.createElement('p');
   newElm.textContent = "hello, hello";
//    console.log(elm.textContent);
   elm.after(newElm);
}

function changeHeading2() {
   const elms = document.getElementsByTagName("h2");  // Array of elements
   for (let i = 0; i < elms.length; i++) {  // using traditional for(;;) loop
      elms[i].textContent = "hello, again";
   }
}

function changeParagraph() {
   const elms = document.getElementsByClassName("para");  // Array of elements
   for (const elm of elms) {  // using JavaScript's for...of loop
         // using const-declaration as a new block-scope elm is created for each iteration
      elm.textContent = "hello, again and again";
   }
}