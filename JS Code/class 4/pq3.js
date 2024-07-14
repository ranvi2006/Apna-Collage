let arr=["Bloomblog","Microsoft","Uber","google","Ibm","Netflix"];

let del=arr.shift();// to delete from the starting inedx
console.log(arr);

for(let i=0;i<arr.length;i++)
    {
        let data=arr[i];
        if(data=="Uber")
            {
                arr[i]="Ola"
            }
        }
        
        arr.push("Amazon");
        console.log(arr);
