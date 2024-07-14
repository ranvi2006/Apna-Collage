let button=document.createElement("button");
button.innerText="click me";
button.style.backgroundColor="red";
button.style.height="50px"; button.style.width="50px";
button.style.color="white";


let body=document.querySelector("body");
body.prepend(button);

let para=document.querySelector("p");
para.classList.add("class2");
console.log(para.classList);

button.onclick=()=>{
    button.style.height="100px";
    button.style.width="100px";
    button.style.borderRadius="50%"
}






