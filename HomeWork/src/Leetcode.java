
public class Leetcode {
//public static void main(String[] args) {
//	int a[]= {2,7,11,15};
//	int target=9;
//	int n[]=array(a, target);
//	for (int i = 0; i < n.length; i++) {
//		System.out.print(n[i]);
//	}
//}
//
//public static int[] array(int a[],int target) {
//
//	int b[]=new int[2];
//	for (int i = 0; i < a.length; i++) {
//		for (int j = i+1; j < a.length; j++) {
//			if(a[i]+a[j]==target)
//			{
//				b[0]=i;
//				b[1]=j;
//						
//			}
//		}
//		
//	}
//	return b;
//}

	public int[] twoSum(int[] nums, int target) {
	     int b[]=new int[2];
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	               if(nums[i]+nums[j]==target)
	               {
	                  
	                   for(int k=0;k<b.length;k++)
	                   {
	                       b[k]=i;
	                       i=j;
	                   }
	               }
	            }
	        }
	         return b;
	    }
	   public static void main(String args[])
	   {
	   Leetcode s=new Leetcode();
	        int a[]={2,7,11,15};
	        int target=9;
	      int n[]= s.twoSum(a,target);
	       for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
	       
	       


	   
	    
	    }
}
