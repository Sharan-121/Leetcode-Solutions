public class negativeMatrix {
    public static void main(String[] args) {
        // System.out.println(countNegatives());
    }
    public static int countNegatives(int[][] grid) {
        
        int rowStart = 0;
        int colEnd = grid[0].length - 1;
        int count = 0;
        
        while(rowStart < grid.length && colEnd >=0){
            
            if(grid[rowStart][colEnd] < 0){
                count+=  grid.length - rowStart;
                colEnd--;
            }
            else{
                rowStart++;
            }
        }
        return count;
        
    }
}
