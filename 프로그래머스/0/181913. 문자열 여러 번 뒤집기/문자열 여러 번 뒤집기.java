class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        //char[] str = my_string.toCharArray();
        
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            String str = new StringBuilder(my_string.substring(start,end+1)).reverse().toString();
            my_string = my_string.substring(0,start) + str + my_string.substring(end+1);
        }
        
        return my_string;
    }
}