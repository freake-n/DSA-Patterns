class Solution {
    public int search(int[] a, int t) {
        int n=a.length;
        int low=0,high=n-1;
        while(low<=high)
        {
            int guess=(low+high)/2;

            if(a[guess]==t)
                return guess;

            if(a[guess]<a[n-1]) // part 1
            {
                if(a[guess]>t)
                    high=guess-1;
                else
                {
                    if(a[n-1]<t)
                        high=guess-1;
                    else
                        low=guess+1;
                }
            }
            else
            {
                if(a[guess]<t)
                    low=guess+1;
                else
                {
                    if(a[0]>t)
                        low=guess+1;
                    else
                        high=guess-1;
                }
            }
        }
        return -1;
    }
}