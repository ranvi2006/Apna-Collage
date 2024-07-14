// take a number form the user and crate a array

let number= prompt("Enetr a number knowing the sum of nth ");
let data=1;
let arr=[];
for(let i=0;i<number;i++)
    {
        arr.push(data);
        data++;
    }
    console.log(arr);

    let sum=arr.reduce((result,val)=>{
         return result+val;
    });

    console.log("The sum of the all number is  "+sum);
    let div=arr.reduce((result,val)=>{
         return result*val;
    });

    console.log("The product of the all number is  "+div);