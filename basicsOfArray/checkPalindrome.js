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
   let reverse=0;
   let temp
   temp=value;
   while(temp>0){
     reverse =Math.trunc(temp%10+reverse*10);
     temp=Math.trunc(temp/10)
   }
   if(reverse==value){
    console.log("its a palindrome")
   }else console.log("its not a palindrom")

    }
  
}
checkpalindrome("madam")
checkpalindrome(121)