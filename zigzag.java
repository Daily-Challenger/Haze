int[] solution(int[] numbers) {
    // Step 1: 결과 배열 만들기
    int[] result = new int[numbers.length - 2];
    
    // Step 2: 각 트리플 확인
    for (int i = 0; i < numbers.length - 2; i++) {
        int a = numbers[i];
        int b = numbers[i + 1];
        int c = numbers[i + 2];
        
        // 조건: a < b > c 또는 a > b < c
        if ((a < b && b > c) || (a > b && b < c)) {
            result[i] = 1;  // Zigzag!
        } else {
            result[i] = 0;  // Not zigzag
        }
    }
    
    // Step 3: 결과 반환
    return result;
}