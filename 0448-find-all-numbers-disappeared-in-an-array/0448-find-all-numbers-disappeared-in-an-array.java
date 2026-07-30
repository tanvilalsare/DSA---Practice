class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer>seen = new HashSet<>();
        int n = nums.length;
        for(int i =0;i<n;i++){//walk the array once, remember every value we see // it go througth the array hence as index starts with 0 it starts with 0 and end at <n
            seen.add(nums[i]);
        }
        // Second loop: check every number 1 to n against what we've seen
        List<Integer> result = new ArrayList<>();
        for(int j=1;j<=n;j++){//its checks for the number existing so it starts with 1 and goes till <=n as its the range 1-n also no 0 cause then as it won't contain 0 so it will also shown in o/t and our test case will fail
            if(!seen.contains(j)){
                result.add(j);
            }
        }
        return result;
    }
}