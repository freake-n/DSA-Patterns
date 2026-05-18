// Link - https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1


class Solution {
    void segregate0and1(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            while (i < j && arr[i] == 0) {
                i++;
            }
            while (i < j && arr[j] == 1) {
                j--;
            }

            if (i < j) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
}



// -------------------------------------------------------------------------



class Solution { 
  void segregate0and1(int[] arr) { 
    int c=0; 
    for(int i:arr) 
      if(i==0) 
        c++; 
    
    Arrays.fill(arr,1); 
    
    for(int i=0;i<c;i++) 
      arr[i]=0; 
  } 
}
