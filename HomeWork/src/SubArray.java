
public class SubArray {
	 static int arr[] = new int[]{1, 2, 3, 4};
     
     // Prints all subarrays in arr[0..n-1]
     static void subArray( int n)
     {
         // Pick starting point
         for (int i=0; i <n; i++)
         {
             // Pick ending point
             for (int j=i; j<n; j++)
             {
            	// System.out.println(j);
            	 
            	 for (int k=i; k<=j; k++)
                 {
                    System.out.print(arr[k]+" ");
                 }
                 System.out.println();
             }
         }
     }
  
     public static void main(String[] args)
     {
         System.out.println("All Non-empty Subarrays");
         subArray(arr.length);
          
     }
}
