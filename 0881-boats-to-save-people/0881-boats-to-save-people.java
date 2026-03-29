class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat = 0;
        int n = people.length;
        int i=0;
        int end=n-1;
        // for(int i=n-1;i>=0;i--){
        //     if(people[i] == limit){
        //         boat++;
        //     }else {
        //         end=i;
        //         break;
        //     }
        // }

        while(i<=end){
            if(people[i]+people[end] <= limit){
                i++;
            }

            end--;
            boat++;

        }

        

        return boat;
    }
}