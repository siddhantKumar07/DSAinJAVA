const reversefn =(num)=>{
let rev=0;
while(num>0){
    rev=num%10+rev*10
    num/10;
}

}