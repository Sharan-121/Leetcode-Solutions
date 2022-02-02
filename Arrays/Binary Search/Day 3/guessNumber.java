public class guessNumber{
    public static void main(String[] args) {
        
    }
    public static int guessNum(int n) {
        
        int start = 1;
        int end = n;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            int pick = guess(mid);
            
            if(pick == 0){
                return mid;
            }
            else if(pick == -1){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
        
    }
    private static int guess(int mid) {
        return 0;
    }

}