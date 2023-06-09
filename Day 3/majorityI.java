// Majority element which appears more than N/2 times
// output should have element which has count > n/2 times
public class majorityI {
    public int majorityElement(int[] nums) {
        int ele = 0;
        int count=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele = nums[i];
            }else if(ele == nums[i]) count++;
            else count--;
        }

        //check if stored element is majority element or not
        int count1=0;
        for(int i =0;i<n;i++){
            if(ele == nums[i]){
                count1++;
            }
        }
            if(count1>(n/2)) return ele;
        return -1;
    }
}

