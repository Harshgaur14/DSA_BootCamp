
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Patternques
{
	public static void main(String[] args) {
		pattern1(5);
		pattern2(5);
		pattern3(5);
		pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(4);
		
	}
	static void pattern1(int n)
	{
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<n-i;j++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
static void pattern2(int n)
	{
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	}	
	
		static void pattern3(int n)
	{
	    for(int row=0;row<2*n;row++)
	    {
	        int totolcol=row>n ? 2*n-row:row;
	        for(int col=0;col<totolcol;col++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
	static void pattern4(int n)
	{
	    for(int row=0;row<2*n;row++)
	    {
	        int totalcol=row>n?2*n-row:row;
	        
	        int space=n-totalcol;
	        for(int i=0;i<space;i++)
	        {
	            System.out.print(" ");
	        }
	        
	        for(int col=0;col<totalcol;col++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
	
	static void pattern5(int n)
    {
            for(int row=1;row<=n;row++)
            {
                for(int spaces=0;spaces<n-row;spaces++)
                {
                    System.out.print("  ");
                }


                for(int col=row;col>=1;col--)
                {
                    System.out.print(col+" ");
                }
                for(int col=2;col<=row;col++)
                {
                    System.out.print(col+" ");
                }
                System.out.println();
            }
    }

    static void pattern6(int n)
    {
            for(int row=1;row<=2*n;row++)
            {
                int c=row>n?2*n-row:row;
                for(int spaces=0;spaces<n-c;spaces++)
                {
                    System.out.print("  ");
                }


                for(int col=c;col>=1;col--)
                {
                    System.out.print(col+" ");
                }
                for(int col=2;col<=c;col++)
                {
                    System.out.print(col+" ");
                }
                System.out.println();
            }
    }
	
	
	
static void pattern7(int n)
{
    int originalN=n;
    n=2*n;
    for(int row=0;row<=n;row++)
    {
        for(int col=0;col<=n;col++)
        {
            int no=originalN-Math.min(Math.min(row, col), Math.min(n-row, n-col));
            System.out.print(no+" ");
        }
        System.out.println();
    }
}

	
	
	
	
	
	
	
	
	
	
}
