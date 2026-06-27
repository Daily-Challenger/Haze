class Solution {
    public boolean isAnagram(String s, String t) {
        // 길이가 다르면 바로 false
        if (s.length() != t.length()) {
            return false;
        }
        
        // HashMap으로 문자 개수 세기
        Map<Character, Integer> map = new HashMap<>();
        
        // s의 문자들 개수 세기
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // t의 문자들 확인
        for (char c : t.toCharArray()) {
            // t의 문자가 map에 없으면 false
            if (!map.containsKey(c)) {
                return false;
            }
            
            // 개수 감소
            map.put(c, map.get(c) - 1);
            
            // 개수가 0 미만이면 false
            if (map.get(c) < 0) {
                return false;
            }
        }
        
        return true;
    }
}
