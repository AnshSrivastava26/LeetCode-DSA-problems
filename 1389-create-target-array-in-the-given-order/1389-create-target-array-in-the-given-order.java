class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> lst = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            lst.add(index[i],nums[i]);
        }

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = lst.get(i);
        }


        return arr;
    }
}