const checkpalindrome=(value)=>{
    if(typeof(value)=="string"){
        const reverse =value.split("").reverse().join("")
        if(value==reverse){
            console.log("its a palindrome number")
        }
        else{
            console.log("its not a palindrome number")
        }

    }
    if(typeof(value)=="number"){


    }
  
}
checkpalindrome("madam")