function solution(codeOwnersMap, directory) {
    let  answer = [];
    if(directory.search('/') > 0 ) {        // 구분자가 있으면
        let a = directory.split('/')[0];
        let b = directory.split('/')[1];
        console.log(codeOwnersMap[a][b]);
    
        answer.push(codeOwnersMap[a][b]);
    }
    else {
        console.log(codeOwnersMap[directory]);
        answer.push(codeOwnersMap[directory]);
    }
    return answer;
}