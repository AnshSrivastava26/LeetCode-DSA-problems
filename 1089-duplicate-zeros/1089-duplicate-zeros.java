class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];

        int i=0;
        int j=0;
        while(i<arr.length && j<arr.length){
            if(arr[i] == 0){
                temp[j++] = 0;
                if(j<arr.length) temp[j++] = 0;
            }else{
                temp[j++] = arr[i];
            }

            i++;
        }

        for(int k = 0;k<temp.length;k++){
            arr[k] = temp[k];
        }
    }
}