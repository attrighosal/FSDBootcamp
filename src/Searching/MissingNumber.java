package Searching;

public class MissingNumber {

    public static int missingNumber(int[] array) {
        int beg=0, end=array.length-1;
        while(beg<=end) {
            int mid = (beg+end)/2;
            // 1. if arr[mid] is single -> return arr[mid]
            if (mid==0 || mid==array.length-1 || (array[mid] != array[mid-1] && array[mid] != array[mid+1])) {
                return array[mid];
            }
            // 2. is the first occurrence at even index -> beg=mid+1
            int firstOccurrence = mid;
            if (array[mid] != array[mid+1]) {
                firstOccurrence = mid-1;
            }
            if (firstOccurrence%2 == 0) {
                beg = mid+1;
            }
            else {
                end = mid-1;
            }
            // 3. else -> end=mid-1
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,1,3,3,4,4,2,2,3,3,1,1,2,2,5,5,7};
        int mn = missingNumber(array);
        System.out.println("Missing number is : "+mn);
    }
}
