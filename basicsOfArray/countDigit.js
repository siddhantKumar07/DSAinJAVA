const countDigit = (digit)=>{
let count=0;
while(digit>0){
    digit=Math.trunc(digit/10);
    count++;
}
console.log(count)
}
countDigit(14555)