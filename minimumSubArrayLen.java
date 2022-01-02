class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int beg=0,end=-1,sum=0,result=Integer.MAX_VALUE,res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            end=i;
            while(sum>=target){
                res=end-beg+1;
                if(res<result){
                    result=res;
                }
                sum-=nums[beg];
                beg++;
            }
            
        }
        return (result!=Integer.MAX_VALUE)?result:0;
    }
}