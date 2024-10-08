class Solution {
    public boolean isHappy(int n) {

        int slow=n;
        int fast=n;

        do{
          slow=findSqaure(slow);
          fast=findSqaure(findSqaure(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }

        return false;
        
    }

            public int findSqaure(int n){
                int ans=0;
                while(n>0){
                    int rem=n%10;
                    ans+=rem*rem;
                    n/=10;
                    
                }
                return ans;
            }

}