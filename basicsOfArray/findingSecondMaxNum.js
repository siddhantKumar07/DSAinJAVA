let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function secondLargest(array){
let largest=0;
let secondLargest=0;
for(const elem of array){
    if(elem>=largest){
        largest = elem;
    }
}
for(const elem of array){
    if(elem>=secondLargest&&secondLargest<largest){
        secondLargest=elem;
    }
}
return secondLargest
}
let reruned = secondLargest(array)
console.log(reruned)