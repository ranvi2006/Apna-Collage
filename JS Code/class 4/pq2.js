let arr=[250,645,300,900,50];
console.log(arr);
let offer=10;
let index=0;
console.log(`after ${offer}% off price`);
for(let arrr of arr)
    {
      let data=arrr;
      let reduseprice=(data/100)*offer;
      arr[index]=data-reduseprice;
index++;
    }
    console.log(arr);

    