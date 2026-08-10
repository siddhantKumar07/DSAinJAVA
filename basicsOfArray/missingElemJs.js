const missing =(arr)=>{
    let missingNumBe = arr.length+1

    // sum of all the num 
    let sum = missingNumBe*(missingNumBe+1)/2

    // finding the sum of array 
    let expectedSum = 0
    for(const elem of arr){
     expectedSum+=elem;
    }
    return sum-expectedSum

}
const Missing = missing([1,2,3,5,6,8,7]);

console.log("missing value is "+Missing)