class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minRange = -1;
        int maxRange = 0;
        int result = 0;
        for(int i = 0;i<weights.length;i++){
            if(weights[i] > minRange){
                minRange = weights[i];
            }
            maxRange+=weights[i];
        }
        
        while(minRange <= maxRange){
            int mid = (minRange + (maxRange - minRange)/2);
            
            if(ifDays(weights,mid,days)){
                result = mid;
                maxRange = mid-1;
            }
            else{
                minRange = mid+1;
            }
            
        }
        return result;
       
    }

    public boolean ifDays(int arr[],int target,int D){
        int sum = 0;
        int days = 1;
        int temp=0;
        
        for(int i = 0;i<arr.length;i++){
            if((sum + arr[i]) > target){
                sum = arr[i];
                days+=1;
            }
            else{
                sum+=arr[i];
            }
        }
        
        return days <= D;
    }
}
    
