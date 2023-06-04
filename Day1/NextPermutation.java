// finding break point by traversing from backside of array from last 2nd element
//if it is last permutation, then we need the first permutation,
// now we need an element which is just greater than 1 and swap it with 1 sso i will be at 1 and j will come from backside of arr and finds 3 and then 1 and 3 will swap its places but i remains at 1st index only which will have 3 as value;
//now reverse the remaining portion of array i.e, from i+1 to arr.length-1
        

class NextPermutation {
    public void nextPermutation(int[] A) {
        if(A==null || A.length<=1) return;
        int i=A.length-2;
        while(i>=0 && A[i]>=A[i+1])
            i--;
        if(i>=0){
            int j=A.length-1;
            while(A[j]<=A[i]) j--;
                swap(A,i,j);
        }
        reverse(A,i+1,A.length-1);
    }
    public void swap(int A[],int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public void reverse (int A[],int i ,int j){
       while(i<j)
            swap(A,i++,j--);
    }   
}