class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0; j < n; j++){
            nums1[m+j] = nums2[j];
        }
        for(int i = 0; i < m+n; i++){
            for(int j = i+1; j < m+n; j++){
                int temp = 0;
                if(nums1[i] > nums1[j]){
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
            System.out.println(nums1[i]);
        }
    }

    public static void main(String[] args){
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m = 3;
        int n = 3;
        Solution s = new Solution();
        s.merge(arr1, m, arr2, n);
    }
}
