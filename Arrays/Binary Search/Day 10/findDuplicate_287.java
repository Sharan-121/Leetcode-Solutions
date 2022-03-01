public class findDuplicate_287{
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,2,3,4,5,6,2}));
    }
    public static int findDuplicate(int[] nums) {
        
        int low = 1;
        int high = nums.length-1;
          
        while(low <= high){
            int mid = low +(high-low)/2;
            int count = 0;
            
            for(int i : nums){
                if(i<=mid){
                    count++;
                }
            }
            if(count > mid){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
          
        
          
      }
}