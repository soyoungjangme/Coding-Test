class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] str = control.split("");
        
        for(int i=0; i<str.length; i++){
            if(str[i].equals("w")){
                answer += 1;
            }else if(str[i].equals("s")){
                answer -= 1;    
            }else if(str[i].equals("d")){
                answer += 10;
            }else if(str[i].equals("a")){
                answer -= 10;
            }
            
            
        }
        
        
        return answer;
    }
}