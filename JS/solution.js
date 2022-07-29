function solution(d, budget) {  // d는 부서별 금액 배열 / budget는 총 예산
  var answer = 0;
  var temp = 0, result = 0, index_num = 0;
  
  while(1) {
      temp = Math.min.apply(null, d)          // 젤 작은 값 구함
      if(result+temp <= budget) {
          result += parseInt(temp);
          
          index_num = d.indexOf(temp);  // 가장 작은 값의 인덱스 찾음
          d.splice(index_num, 1);       // 가장 작은 수 제거
          answer++;            
      }
      else {
          break;
      }
  }
  return answer;
}