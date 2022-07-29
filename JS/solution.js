function solution(numbers) {
  var answer = [];
  var temp = [];
  
  for(let i=0; i<numbers.length-1; i++) {
      for(let j=i+1; j<numbers.length; j++) {
          temp.push(numbers[i]+numbers[j]);
      }
      //console.log("");
  }
  answer = [...new Set(temp)];
  answer.sort((a,b) => a - b) //sort() ASCII값으로 정렬임됨 -> 그래서 숫자 정렬이랑 다르게 나옴
  
  return answer;
}