function solution(N, stages) {
    let answer = [];
    let user = stages.length; // 총 인원
    
    for(let i=1; i<=N+1; i++) {
        let temp = stages.filter(n => n === i).length;	// Array.filter() : 일치하는 모든 값을 배열로 리턴
        answer.push([i, temp / user]);
        user -= temp; 								//전체 인원에서 실패한 사람 제외
    }
    answer.pop(); 									//마지막은 모두 깬사람들이므로 실패율이 없어서 pop()
    // 2번째 원소 기준으로 내림차순 정렬 // map형태로 있으니까 [index, 실패율], 그러니까 실패율을 기준으로 정렬
    answer = answer.sort((a,b) => b[1] - a[1]);
    
    // [index, 실패율] / index를 기준으로 mapping
    answer = answer.map(a => a[0]);
    return answer;
}
