package org.probablity;

class FindMaximum 
{ 
    /* Utility Functions to get max and minimum of two integers */
    int max(int x, int y)  
    { 
        return x > y ? x : y; 
    } 
  
    int min(int x, int y)  
    { 
        return x < y ? x : y; 
    } 
  
    /* For a given array arr[], returns the maximum j-i such that 
       arr[j] > arr[i] */
    int maxIndexDiff(int arr[], int n)  
    { 
        int maxDiff; 
        int i, j; 
  
        int RMax[] = new int[n]; 
        int LMin[] = new int[n]; 
  
        /* Construct LMin[] such that LMin[i] stores the minimum value 
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = arr[0]; 
        for (i = 1; i < n; ++i) {
            LMin[i] = min(arr[i], LMin[i - 1]);            
        }
        System.out.println("min array");
        printArray(LMin);
        /* Construct RMax[] such that RMax[j] stores the maximum value 
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = arr[n - 1]; 
        for (j = n - 2; j >= 0; --j) {
            RMax[j] = max(arr[j], RMax[j + 1]); 
        }
        System.out.println("max array");
        printArray(RMax);
        /* Traverse both arrays from left to right to find optimum j - i 
           This process is similar to merge() of MergeSort */
        i = 0; j = 0; maxDiff = -1; 
        while (j < n && i < n)  
        { 
            if (LMin[i] < RMax[j])  
            { 
                maxDiff = max(maxDiff, j - i); 
                j = j + 1; 
            }  
            else 
                i = i + 1; 
        } 
  
        return maxDiff; 
    } 
  
    /* Driver program to test the above functions */
    public static void main(String[] args)  
    { 
        FindMaximum max = new FindMaximum(); 
        int arr[] = {8,7,6,5,2}; 
        int n = arr.length; 
        System.out.println("array "); 
        printArray(arr);
        int maxDiff = max.maxIndexDiff(arr, n); 
        System.out.println(maxDiff); 
    } 
    
   static void printArray(int[] arr){
	   System.out.print("{");
	   for(int a : arr) {
    		System.out.print(a+",");
    	}
    	System.out.println("}");
    }
} 