
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
