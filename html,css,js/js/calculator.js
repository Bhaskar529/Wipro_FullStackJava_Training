function addition() {
    
        var num1 = parseInt(document.getElementById("number1").value);
        var num2 = parseInt(document.getElementById("number2").value);
        if(isNaN(num1) || isNaN(num2)){
            document.getElementById("result").innerHTML="please enter a valid number";
        }
        else{
       document.getElementById('result').innerHTML="Result is : "+(num1 + num2);
        }
}
function subtraction() {
    var num1 = parseInt(document.getElementById("number1").value);
    var num2 = parseInt(document.getElementById("number2").value);
    if(isNaN(num1) || isNaN(num2)){
        document.getElementById("result").innerHTML="please enter a valid number";
    }
    else{
        document.getElementById('result').innerHTML="Result is : "+(num1 - num2);
    }
    
   
}
function multiplication() {
    var num1 = parseInt(document.getElementById("number1").value);
    var num2 = parseInt(document.getElementById("number2").value);
    if(isNaN(num1) || isNaN(num2)){
        document.getElementById("result").innerHTML="please enter a valid number";
    }
    else{
        document.getElementById('result').innerHTML="Result is : "+(num1 * num2);
    }
   
}
function division() {
    var num1 = parseInt(document.getElementById("number1").value);
    var num2 = parseInt(document.getElementById("number2").value);
    if(isNaN(num1) || isNaN(num2)){
        document.getElementById("result").innerHTML="please enter a valid number";
    }
    else{
        document.getElementById('result').innerHTML="Result is : "+(num1 / num2);
    }
   
   
}
function clearinputfield(){
    document.getElementById("myform").reset();
}

 