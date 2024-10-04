import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sortArr[] = arr.clone();
        Arrays.sort(sortArr);
        Map<Integer, Integer> rankArr = new HashMap<>();
            int rank = 1;
            for(int number : sortArr){
                if(!rankArr.containsKey(number)){
                    rankArr.put(number, rank);
                    rank++;
                }
            }
            int rankArray[] = new int[arr.length];
            for(int i = 0; i <arr.length; i++)
                rankArray[i] = rankArr.get(arr[i]);
        return rankArray;
    }
    
    public static void main(String[] args){
    int arra[] = {12, 34, 53, 233, 65, 34, 75, 90};
    Solution s = new Solution();
    int x[] = s.arrayRankTransform(arra);
    for(int i = 0; i<arra.length; i++)
        System.out.print(x[i]+" ");
    }
}
