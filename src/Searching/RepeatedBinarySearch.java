package Searching;

public class RepeatedBinarySearch {

    public static int repeatedBinarySearch(int[] sortedArray, int target) {
        int beg=0, end=sortedArray.length-1;
        while (beg<=end) {
            int mid = (beg+end)/2;
            if (sortedArray[mid]==target) {
                if (mid>0 && sortedArray[mid-1]==target) {
                    end = mid-1;
                }
                else {
                    return mid;
                }
            }
            else if (sortedArray[mid]<target) {
                beg = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = new int[] {1,1,2,2,2,3,4,4};
        int target = 1;
        int index = repeatedBinarySearch(sortedArray, target);
        System.out.println("Index : " + index);
    }
}
