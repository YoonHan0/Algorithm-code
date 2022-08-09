function solution(n) {
    let answer = 0;
    let sam = n.toString(3); // 3진수로 변환
    let reverse_sam = sam.split("").reverse().join(""); 

    //console.log(reverse_sam)
    let num = parseInt(reverse_sam, 3).toString(10);
    answer = parseInt(num);
    return answer;
}
