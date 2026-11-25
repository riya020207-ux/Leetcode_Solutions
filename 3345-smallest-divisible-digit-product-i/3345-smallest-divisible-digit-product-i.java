class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int loda=n;
            int prod=1;
            while(loda>0){
                int d=loda%10;
                prod=prod*d;
                loda=loda/10;
            }
            if(prod%t==0){
                return n;
            }
            n++;
        }             
    }
}