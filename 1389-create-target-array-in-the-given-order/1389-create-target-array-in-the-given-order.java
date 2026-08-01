class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] res = new int[n];
        for(int i =0;i<n;i++){
            list.add(index[i] , nums[i]);
        }
        for(int i =0;i<n;i++){
            res[i] = list.get(i);
        }
        return res;

        }
        
    }
