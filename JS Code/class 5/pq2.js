// by arrow function
const countNoOfVowels=(str)=>
{

    let vowels=0;
    for(let ss of str)
        {
          if(ss=="a"||ss=="e"||ss=="i"||ss=="o"||ss=="u")
            {
                vowels=vowels+1;
                console.log("vowels",vowels,"  alphabat  ",ss)
            }
          

        }
return vowels;
}
let sss=countNoOfVowels("My Name Is Raju Kumar Mandal")
console.log("No of vowel present in the given String is "+sss);