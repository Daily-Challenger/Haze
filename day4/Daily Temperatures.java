class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();  // 인덱스를 저장
        
        // 배열을 뒤에서부터 순회
        for (int i = n - 1; i >= 0; i--) {
            // Stack의 인덱스들이 가리키는 기온이
            // 현재 기온보다 낮으면 pop
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            
            // Stack이 비어있으면 더 따뜻한 날이 없음
            if (stack.isEmpty()) {
                result[i] = 0;
            } else {
                // Stack의 맨 위 인덱스가 다음 더 따뜻한 날
                result[i] = stack.peek() - i;
            }
            
            // 현재 인덱스를 Stack에 추가
            stack.push(i);
        }
        
        return result;
    }
}
