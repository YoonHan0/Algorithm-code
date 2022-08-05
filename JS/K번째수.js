function solution(array, commands) {
    var answer = [];
    
    for(let i=0; i<commands.length; i++) {
        let temp = array.slice(commands[i][0]-1, commands[i][1]);
        
        temp.sort();
        //console.log(temp);
        console.log(temp[commands[i][2]]-1);
        answer.push(temp[commands[i][2]]-1);

    }
    return answer;
}

