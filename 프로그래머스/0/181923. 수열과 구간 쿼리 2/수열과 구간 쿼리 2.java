class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        int cycle = 0;
        
        for(int[] query : queries) {
            
            int min = Integer.MAX_VALUE;
            
            for(int i=query[0]; i<=query[1]; i++) { // 'query 첫 번째 숫자'번째부터 'query 두 번째 숫자'번째까지 반복
                if(arr[i] > query[2] && arr[i] < min) { // i번째 숫자가 'query 세 번째 숫자'보다 크고, 그 값 중 '현재의 최소값(min)'보다 작을 때
                    min = arr[i]; // 최소값을 i번째 숫자로 지정
                }
            }
            
            answer[cycle] = (min != Integer.MAX_VALUE) ? min : -1; // 최소값이 배열 내의 숫자일 경우 cycle번째 숫자를 그 숫자로 지정하고, 2보다 큰 최소값이 없다면 cycle번째 숫자를 -1로 지정
            
            cycle++; // queries의 길이만큼 반복
        }
        
        return answer;
    }
}