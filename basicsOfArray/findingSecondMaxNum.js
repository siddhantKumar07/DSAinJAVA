const arr=[1,2,3,4,5,6,7,8,9,10]

function secondLargest(arr){
let largest=-Infinity
let secondLargest=-Infinity

for(let elem of arr){
if(elem>largest){
    largest=elem
    secondLargest=largest

    if(elem>secondLargest){
        secondLargest= elem

    }
}
}
return secondLargest
}

let secondLargestElem = secondLargest(arr)
console.log(secondLargestElem)