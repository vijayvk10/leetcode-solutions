class Solution {
    public int[] twoSum(int[] arr, int t) {
        int n=arr.length;
        int[] index={-1,-1};
        	for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(i!=j){
		            if(t==arr[i]+arr[j]){
		                index[0]=i;
		                index[1]=j;
		            }
		        }
		    }
		}
        return index;
    }
}