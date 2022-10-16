import java.util.Arrays;

public class Cyclesort {
   public static void main(String[] args) {
    int[] nums={3,5,2,1,4};
    cycle(nums);
    System.out.println(Arrays.toString(nums));
   }
   static void cycle(int[] nums)
   {
    int i=0;
    while(i<nums.length)
    {
        int correct=nums[i]-1;
        if(nums[i]!=nums[correct])
        {
            swapped(nums,i,correct);
        }
        else{
            i++;
        }
    }
   } 

   static void swapped(int[] nums,int first,int second){
    int temp=nums[first];
    nums[first]=nums[second];
    nums[second]=temp;

   }
}
