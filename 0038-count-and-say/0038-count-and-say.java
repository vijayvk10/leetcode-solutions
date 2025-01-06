class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        return count(n,"1", 1);
    }
    public String count(int n, String ans,int cnt){
        if(cnt==n){
            return ans;
        }
        int len=ans.length();
        StringBuilder sb=new StringBuilder();
        char c=ans.charAt(0);
        int count=1;
        int left=0;
        int right=1;
        while(right<len){
            if(ans.charAt(right)==c){
                count++;
                right++;
            }
            else{
                sb.append(count);
                sb.append(c);
                c=ans.charAt(right);
                count=1;
                left=right;
                right=left+1;
            }
        }
        sb.append(count);     
        sb.append(c);
        return  count(n,sb.toString(),cnt+1);
    }
}