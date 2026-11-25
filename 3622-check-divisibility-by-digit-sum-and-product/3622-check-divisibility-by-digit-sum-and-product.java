class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,product=1;
        for(int i=n;i>0;i=i/10){
            int d=i%10;
            sum=sum+d;
            product=product*d;
        }
        if(n%(sum+product)==0){
            return true;
        }
        return false;
        
    }
}