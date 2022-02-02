public class firstBadVersion {
    public static void main(String[] args) {
        
    }
    public static int firstBadVer(int n) {
        
        int start = 1;
        int end = n;
        
        while(start < end){
            int mid = start + (end-start)/2;
            boolean isBad = isBadVersion(mid);
            
            if(isBad){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    private static boolean isBadVersion(int mid) {
        return false;
    }
}
