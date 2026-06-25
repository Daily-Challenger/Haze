class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap: 숫자 → 인덱스 저장
        Map<Integer, Integer> map = new HashMap<>();
        
        // 한 번의 루프
        for (int i = 0; i < nums.length; i++) {
            // 필요한 다른 숫자
            int complement = target - nums[i];
            
            // 이미 본 숫자인가?
            if (map.containsKey(complement)) {
                // 찾음!
                return new int[] {map.get(complement), i};
            }
            
            // 못 찾으면 현재 숫자를 저장
            map.put(nums[i], i);
        }
        
        return new int[] {};
    }
}