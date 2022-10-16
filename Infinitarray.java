public class Infinitarray{
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int target=130;
        int ans=searchelement(arr,target);
        System.out.println(ans);
    }
    static int searchelement(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while(arr[end]<target){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
         }
         return binarysearch(arr,start,end,target);
 
    }


        static int binarysearch(int[] arr,int start,int end,int target)
        {
           while(start<=end)
           {
            int mid=start+(end-start)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]==target){
                return mid;
            }
            
 
        }
        return -1; 
        }
}