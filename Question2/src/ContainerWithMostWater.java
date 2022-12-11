public class ContainerWithMostWater {
	
	public int maxWater ( int[] arr ){
		
		int left = 0;
		int right = arr.length -1;
		int currentLeft = 0;
		int currentRight = arr.length -1;
		int maxArea = 0;
		
		while (left < right){
			int area = Math.min( arr[left] , arr[right]) * (right-left);
			if (maxArea < area) {
				maxArea = area;
				currentLeft = left;
				currentRight = right;
			}
			if(arr[left] <= arr[right]){
				left ++;
			}else{
				right--;
			}
			
		} return maxArea;
	}
}

