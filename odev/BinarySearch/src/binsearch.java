
public class binsearch {
	public static void main(String[] args){
	        int[] actual = { 1, 3, 5, 6, 8, 10 };
	        int result = bnry(actual,10);
	        System.out.println(result);
	    }
	  static int bnry(int [] a,int target){
	        int left = 0;
	        int right = a.length-1;
	        while(left<=right){
	            int mid = (left+right)/2;
	            if(target<a[mid]){
	                right = mid-1;
	            }
	            else if(target>a[mid]){
	                left = mid+1;
	            }
	            else{
	                return +1;
	            }           
	        }
	        return -1;
	    }
}
