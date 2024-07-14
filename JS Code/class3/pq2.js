// Create a game where you start with any rando game number .Ask to the user to leep guessing the game number until the user enters correct value..

let gameNumber=45;
let guessNumber=0;
do{
 guessNumber=prompt("Guess the number which is present in the game  and get a joke");
 console.log("better luck next time");
} while(guessNumber!=gameNumber);
if(guessNumber==gameNumber){
alert("your number is match to the game number\nyou have unlocked joke box\nhumne jo socha o huwa nhi ki humne jo socha o huwa nhi.... because humne kabhi dimag paya nhi ....");
}
