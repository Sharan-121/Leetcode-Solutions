public class arrangingCoins{
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }

    public static int arrangeCoins(int n) {
        
        
        long start = 1;
        long end = n;
        
        while(start <= end){
            long mid = start + (end-start)/2;
            long sum = (mid * (mid+1))/2;
            
            if(sum  < n){
                start = mid + 1;
            }
            else if(sum > n){
                end = mid-1;
            }
            else{
                return (int)mid;
            }
        }
        return (int)end;
    }

}