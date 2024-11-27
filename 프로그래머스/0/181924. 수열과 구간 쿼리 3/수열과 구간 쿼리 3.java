class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i=0; i<queries.length; i++) {
            
            int first = queries[i][0]; // query 첫 번째 숫자
            int second = queries[i][1]; // query 두 번째 숫자
            
            int temp = arr[first]; // 'query 첫 번째 숫자'번째에 해당하는 수 임시저장
            arr[first] = arr[second]; // first에 해당하는 숫자를 'query 두 번째 숫자'번째에 해당하는 수로 변경
            arr[second] = temp; // 'query 두 번째 숫자'번째에 해당하는 수를 임시저장했던 'query 첫 번째 숫자'번째에 해당하는 수로 변경
            
        }
        
        answer = arr;
        
        return answer;
    }
}