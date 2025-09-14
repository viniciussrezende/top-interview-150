package arraystring.removeelements;

import java.util.Arrays;

public class RemoveElementsClass{
  public static void main(String ...args){
    int[] nums = new int[]{0,1,2,2,3,0,4,2};
    int val = 2;


    System.out.println(Arrays.toString(nums));

    int k = removeElement(nums, val);
    
    System.out.printf("Value of k: %d\n", k);
    System.out.println(Arrays.toString(nums));
  }


  public static int removeElement(int[] nums, int val){

    int k = 0;

    for(int i = 0, j = 0; i < nums.length; i++){
      if (nums[i] != val) {
        if(nums[j] != nums[i])
          nums[j] = nums[i];
        j++;
        k++;
      }
    }

    return k;
  }
}