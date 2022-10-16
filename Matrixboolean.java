public class Matrixboolean {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    
};
        int target=12;
        System.out.println(searchMatrix(matrix,target));
    }
        static boolean searchMatrix(int[][] matrix, int target) {
            int row=matrix.length;
            int col=matrix[0].length;
            if(row==1)
            {
                return binarysearch(matrix,0,0,col-1,target);
            }
            int rowstart=0;
            int rowend=row-1;
            int colmid=col/2;
            while(rowstart<(rowend-1))
            {
                int mid=rowstart+(rowend-rowstart)/2;
                if(matrix[mid][colmid]==target)
                    return true;
                if(matrix[mid][colmid]>target)
                {
                    rowend=mid;
                }
                else
                {
                    rowstart=mid;
                }
            }
            
            //checking target in the col
            if(matrix[rowstart][colmid]==target)
                return true;
            if(matrix[rowstart+1][colmid]==target)
                return true;
            
            //now in 4 parts
            if(matrix[rowstart][colmid]>=target){
                return binarysearch(matrix,rowstart,0,colmid-1,target);
            }
            if(matrix[rowstart][colmid+1]<=target && matrix[rowstart][col-1]>=target){
                    return binarysearch(matrix,rowstart,colmid+1,col-1,target);
            }
             if(matrix[rowstart+1][colmid]>=target){
                return binarysearch(matrix,rowstart+1,0,colmid-1,target);
             }
            else{
                return binarysearch(matrix,rowstart+1,colmid+1,col-1,target);
            }    
        }
        
      static  boolean binarysearch(int[][] matrix,int row,int colstart,int colend,int target)
        {
            while(colstart<=colend)
            {
                int mid=colstart+(colend-colstart)/2;
                if(matrix[row][mid]==target)
                {
                    return true;
                }
                else if(matrix[row][mid]>target)
                {
                    colend=mid-1;
                }
                else
                {
                    colstart=mid+1;
                }
            }
            return false;
        }
        
        
}
    
