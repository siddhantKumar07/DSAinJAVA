const twoSum =(array,target)=>{
    for(let i=0;i<array.length;i++){
        for(let j=i+1;j<array.length;j++){
            if(array[i]+array[j]==target){
                return [i,j]
            }
        }
    }

}
const array = [1,2,3,4,5,6]
console.log(twoSum(array,9))
