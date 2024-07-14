// we are given array of stidents filter out of the marks of stident that score 90+;

let marks=[56,97,45,95,54,98,87,90,91,78,92];
let marks90=marks.filter((val)=>{
    return val>90;

});

console.log(marks90);