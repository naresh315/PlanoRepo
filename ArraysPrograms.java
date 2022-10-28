Peak Element  
Solution 1.
  int findPeakELement(int arr[], arrlength){
    if (arrlength == 1)
      return arr[0];//return the element if there's only one element in the array
    if (arr[0] >= arr[1])
        return arr[0];
    if (arr[arrlength - 1] >= arr[arrlength - 2])
        return arr[arrlength - 1];
 
    // find the peak in the remaining array elements
    for(int i = 1; i < arrlength - 1; i++)
    {
         //comparing current element with neighbours
        if (arr[i] >= arr[i - 1] &&
            arr[i] >= arr[i + 1])
            return arr[i];
    }
    return arr[0];
}

Find the minimum and maximum element in an array
Write a program to reverse the array
Write a program to sort the given array
Find the Kth largest and Kth smallest number in an array
Find the occurrence of an integer in the arraySort the array of 0s, 1s, and 2s
Subarray with given Sum
Move all the negative elements to one side of the array
Find the Union and Intersection of the two sorted arraysWrite a program to cyclically rotate an array by oneFind the missing integer
Count Pairs with given sum
Find duplicates in an array
Sort an Array using the Quicksort algorithm
Find common elements in three sorted arrays
Find the first repeating element in an array of integers
Find the first non-repeating element in a given array of integers
Subarrays with equal 1s and 0s
Rearrange the array in alternating positive and negative items
Find if there is any subarray with a sum equal to zero
Find the Largest sum contiguous Subarray
Find the factorial of a large number
Find Maximum Product Subarray
Find the longest consecutive subsequence
Find the minimum element in a rotated and sorted array
Max sum in the configuration
Minimum PlatformsMinimize the maximum difference between the heights
Minimum number of jumps to reach the end
Stock Span problemFind a triplet that sums to a given value
Smallest positive missing numberFind the row with a maximum number of 1’s
Print the matrix in a Spiral manner
Find whether an array is a subset of another array
Implement two Stacks in an arrayMajority Element
Wave ArrayTrapping RainwaterLevel 3
Maximum IndexMax sum path in two arrays
Find Missing And RepeatingStock buy and sell Problem
Pair with the given sum in a sorted array
Chocolate Distribution ProblemPartition Equal Subset Sum<br>
Smallest Positive integer that can’t be represented as a sum

Coin Change Problem

Longest Alternating subsequence 
