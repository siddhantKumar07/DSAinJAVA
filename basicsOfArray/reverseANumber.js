const reversefn =(num)=>{
let rev=0;
while(num>0){
    rev=num%10+rev*10
    num=Math.trunc(num/10);
}
return rev
}
console.log(reversefn(155))