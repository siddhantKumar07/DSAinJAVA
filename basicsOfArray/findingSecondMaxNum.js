const arr=[1,2,3,4,5,6,7,8,9,10,11]

// this fun returns se
function secondLargest(arr){
let largest=-Infinity
let secondLargest=-Infinity


for(let i =0;i<arr.length;i++){
if(arr[i]>largest){
    secondLargest = largest
    largest=arr[i]
}
else if(arr[i]>secondLargest){
    secondLargest = arr[i]
}


}
return secondLargest
}

let secondLargestElem = secondLargest(arr)
console.log(secondLargestElem)