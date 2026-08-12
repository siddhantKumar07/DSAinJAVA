const twoSum =(array,target)=>{
    for(let i=0;i<array.length;i++){
        for(let i=i+1;i<array.length;j++){
            if(array[i]+array[j]==target){
                return [i,j]
            }
        }
    }

}

