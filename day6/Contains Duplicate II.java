class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 크기 k인 윈도우를 위한 Set
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // 윈도우 크기 초과하면 맨 앞 제거
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            
            // 현재 값이 window에 있으면 true
            if (window.contains(nums[i])) {
                return true;
            }
            
            // 현재 값을 window에 추가
            window.add(nums[i]);
        }
        
        return false;
    }
}