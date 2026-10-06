class Solution {
    public int search(int[] a, int target) {
        int n=a.length;
        int res=-1,low=0,high=n-1;
        int c=(target<=a[n-1])?1:2;
        int sep=-1;

        if(a[0]<=a[n-1])
        {
            low=0;
            high=n-1;
        }

        else
        {
            while(low<=high)
            {
                int guess=(low+high)/2;
                if(a[guess]==target)
                    return guess;
                if(a[guess]>a[n-1])
                    low=guess+1;
                else
                {
                    sep=guess;
                    high=guess-1;
                }
            }
            if(c==1)
            {
                low=sep;
                high=n-1;
            }
            else
            {
                low=0;
                high=sep-1;
            }
        }

        while(low<=high)
        {
            int guess=(low+high)/2;
            if(a[guess]==target)
                return guess;
            else if(a[guess]<target)
                low=guess+1;
            else
                high=guess-1;
        }
        return -1;
    }
}