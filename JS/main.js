function solution(n, m) {
  var answer = [];
  let gcd = 1;
  let lcm = 1;

  for(let i=2; i<=Math.min(n, m); i++){   // 최대공약수 구하기
    if(n % i === 0 && m % i === 0){
        gcd = i;
    }
  }
   
  while(true){                          // 최소공배수 구하기
    if((lcm % num1 == 0) && (lcm % num2 == 0)){
      break;
    }
    lcm++;
  }
  answer.push(gcd);             // 배열에 값 추가
  answer.push(lcm);
  return answer;
}

