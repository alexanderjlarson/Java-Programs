
public class TopThreeNums {

	public static void main(String[] args) {
		int max;
		int maxPos;
		int[] nums = {7, 11, 14, 1, 5, 8, 17, 14, 15};
		for (int i = 0; i < 3; i++){
			maxPos = 0;
			max = nums[0];
			for (int j = 1; j < nums.length; j++){
				if (nums[j] > max){
					max = nums[j];
					maxPos = j;
				}
			}
			System.out.printf("Value %d found at location %d.\n",max,maxPos);
			nums[maxPos] = -nums[maxPos];
		}

	}

}
