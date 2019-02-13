package method;

public class ReturnMethod {
//모르겠음
	static int indexOf(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
		public static void main(String[] args) {
		int[] nums= new int[3];
		nums[0] = 7;
		nums[1] = 4;
		nums[2] = 7;
		System.out.println("으아아"+indexOf(nums,5));
		
			}
		}
//index를 이용해 범위에서 원하는 값을 뽑아내는 방법
