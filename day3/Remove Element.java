class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n-1];  // 마지막 값으로 덮기
                n--;  // 유효한 길이 감소
            } else {
                i++;  // 다음 원소 확인
            }
        }
        
        return n;
    }
}