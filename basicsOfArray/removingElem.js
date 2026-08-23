const removeElement = (arr,elem)=>{
    for(let i =0;i<arr.length;i++){
        if(arr[i]==elem){
            arr.splice(i,1);
        }
    }
    return arr
}

const array = [1,2,3,4,5,6,7,5];
console.log(removeElement(array,5))