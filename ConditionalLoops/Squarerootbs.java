public class Squarerootbs {
    public static void main(String[] args) {
        int n=40;
        int p=4;
        System.out.println(sqrt(n,p));
        //pretty printing
        System.out.printf("%.3f",sqrt(n,p));
    }

    //O(logn)
    static double sqrt(int n,int p)
    {
        int start=0;
        int end=n;
            double root=0.0;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(mid*mid==n)
                {   
                    root=mid;
                        return mid;
                }
                else if(mid*mid<n)
                {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
          //  System.out.println(root);
            double inc=0.1;
            for(int i=0;i<p;i++)
            {
                while(root*root<=n){
                    root+=inc;
                }

                root-=inc;
                inc/=10;
            }



        return root;
    }

}
