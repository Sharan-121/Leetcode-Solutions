

public class sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2));
    }
    public static int mySqrt(int x) {
        
        long start = 1;
        long end = x;
        
        while(start <= end){
            long mid = start + (end-start)/2;
            
            if(mid*mid < x){
                start = mid+1;
            }
            else if(mid * mid > x){
                end = mid-1;   
            }
            else{
                return (int)mid;   
            }
        }
        return (int)end;
    }
}
