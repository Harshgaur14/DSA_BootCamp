import java.util.Arrays;
public class Searcharray
{
	public static void main(String[] args) {
		int matrix[][] = {
		            {1},
		            {4}
		};
        int target=0;
        System.out.println(Arrays.toString(search(matrix,target)));
	}
	
	
	static int[] search(int[][] matrix,int target)
	{
        int row=matrix.length;
        int col=matrix[0].length;
       
        
        if(row==1)
        {
            return binarysearch(matrix, 0, 0, col-1, target);
        }
        int rowstart=0;
        //int colstart=0;
        int rowend=row-1; 
      
        int colmid=col/2;
        
        while(rowstart<(rowend-1))
        {    
            int rowmid=rowstart+(rowend-rowstart)/2;
           
            if(matrix[rowmid][colmid]==target)
            {
                return new int[]{rowmid,colmid};
            }
            if(matrix[rowmid][colmid]<target)
            {
                rowstart=rowmid;
            }else
            {
                rowend=rowmid;
            }
        
        //checking target in the col
        if(matrix[rowstart][colmid]==target)
        {
            return new int[]{rowstart,colmid};
        }
        if(matrix[rowstart+1][colmid]==target)
        {
            return new int[]{rowstart+1,colmid};
        }
        
        
        if(matrix[rowstart][colmid-1]>= target)
        {
            return binarysearch(matrix,rowstart,0,colmid-1,target);
        }
        if(matrix[rowstart][colmid+1]<=target && matrix[rowstart][col-1]>=target)
        {
            return binarysearch(matrix,rowstart,colmid+1,col-1,target);
        }
        if(matrix[rowstart+1][colmid-1]>=target)
        {
            return binarysearch(matrix,rowstart+1,0,colmid-1,target);
        }else
        {
            return binarysearch(matrix,rowstart+1,colmid+1,col-1,target);
        }
       
        }
    return new int[]{-1,-1};
    
	}
	
	
	
	
	
	 static int[] binarysearch(int[][] matrix,int row,int colstart,int colend,int target)
    {
        while(colstart<=colend)
        {
            int mid=colstart+(colend-colstart)/2;
            if(matrix[row][mid]==target)
            {
                return new int[]{row,mid};
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
            return new int[]{-1,-1};
    }
    
	
	
	
}
