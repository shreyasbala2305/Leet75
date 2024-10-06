class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        int w1start = 0, w1end = words1.length-1;
        int w2start = 0, w2end = words2.length-1;

        while(w1start <= w1end && w2start <= w2end && words1[w1start].equals(words2[w2start])){
            w1start++;
            w2start++;
        }

        while(w1end >= w1start && w2end >= w2start && words1[w1end].equals(words2[w2end])){
            w1end--;
            w2end--;
        }

        return w1end < w1start || w2end < w2start;
    }

    public static void main(String[] args){
        String sentence1 = "Hello Tony";
        String sentence2 = "Hello my name is Tony";

        Solution s = new Solution();

        if(s.areSentencesSimilar(sentence1, sentence2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
