// Array   

// arry is the collection of values and its type is object..

// array declearation 
let arr=["raju","anokhi","prince","mantu","loknath"];

// to get array length
console.log("array length is  "+arr.length);

// to get character at specfic index
console.log("character at index 0 is "+arr[0]);

// to itarate over the array  1st

for(let i=1;i<arr.length;i++)
    {
        console.log("value at index "+i+" is "+arr[i])
    }

    // to itarate over the array  2nd

    for(let arrr of arr)
        {
            console.log(arrr);
        }