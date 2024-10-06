class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int i=0, j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                merge.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                merge.append(word2.charAt(j));
                j++;
            }
        }
        return merge.toString();
    }
    
    public static void main(String[] args){
        String word1 = "abcd";
        String word2 = "pqrs";
        Solution s = new Solution();
        String merge = s.mergeAlternately(word1, word2);
    }
}
