class Solution {
    public boolean containsDuplicate(int[] nums) {
        //construct hash set
        Set<Integer> seen = new HashSet<>();

        //loop array
        for (int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
