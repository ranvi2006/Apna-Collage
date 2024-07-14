//to declear a veriable we use cemal case  which first letter in lowerCase and all other word first leter in Capital leter
var age = 19;
// if you decleared a type of veriable then var is given the access to re declear the same veriable;
let name = "Raju Kumar Mandal";
// if you declear a verable by let keyword the let does not give the acces to re-declear the veriable
const number = 100;
// if you declear a veriable by const keyword the it must be defined and we can not re-defind the veriable

// we aslo declear a object by const keyword but we can re-defined the value of the key word;
const product = {
  name: "pen",
  color: "black",
  price: 20,
  isDealOfTheDay: true,
};

// console.log("The Name of the product is  "+product.name);

// console.log("The Color of the product is  "+product.color);

// console.log("The Price of the product is  "+product.price);

// console.log("The Deal of the day is going on  "+product.isDealOfTheDay);

console.log(product);
product.color = "red"; // to change the values of the key which is present in the product object;
console.log(product);

const profile = {
  userName: "Anokhi@Raju",
  following: 134,
  followers: 1278,
  isFollow: false,
};

console.log(profile);
console.log(" the data type and veriale concept clear");
