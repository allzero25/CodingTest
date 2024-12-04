import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for(int num=l; num<=r; num++) {
            
            String strNum = String.valueOf(num);
            boolean isValid = true;
            
            // 각 숫자가 0 또는 5로만 이루어졌는지 확인
            for(char ch : strNum.toCharArray()) {
                if(ch != '5' && ch != '0') {
                    isValid = false;
                }
            }
            
            // 0과 5로만 이루어진 숫자라면 리스트에 추가
            if(isValid)
                answer.add(num);
        }
        
        // 결과가 없으면 -1 반환
        if(answer.isEmpty()) {
            return new int[]{-1};
        }
        
        // 리스트를 배열로 변환하여 반환
        return answer.stream()
	                 .mapToInt(Integer::intValue)
    	             .toArray();
    }
}