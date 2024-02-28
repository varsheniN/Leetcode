int reverse(int n){
 long ldig=0,rev=0;
while(n!=0){
    ldig=n%10;
    rev=(rev*10)+ldig;
    n=n/10;
}
if(n<0) rev*=-1;
if(rev>=-1*pow(2,31)&&rev<=pow(2,31)-1) return rev;
else return 0;
}