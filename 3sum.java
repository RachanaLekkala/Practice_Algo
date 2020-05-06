class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer> > res = new ArrayList<List<Integer>>(); 
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
            
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                k--;
                continue;
            }
                else if(sum==0)
                {
                   List<Integer> a = new ArrayList<Integer>(3); 
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                    res.add(a);
                    j++;
                    k--;
                }
                else if(sum>0)
                    k--;
                else
                    j++;
            }
        }
        return res;
    }
}