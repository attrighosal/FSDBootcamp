package Searching;

public class RotatedBinarySearch {

    public static int rotatedBinarySearch(int[] rotatedSortedArray, int target) {
        int beg = 0, end = rotatedSortedArray.length-1;
        while (beg<=end) {
            int mid = (beg+end)/2;
            if (rotatedSortedArray[mid] == target) {
                return mid;
            }
            else if (rotatedSortedArray[beg]<rotatedSortedArray[mid]) { // beg to mid sorted
                if (target>=rotatedSortedArray[beg] && target<rotatedSortedArray[mid]) {
                    end = mid-1;
                }
                else {
                    beg = mid+1;
                }
            }
            else { // mid+1 to end sorted
                if (target>rotatedSortedArray[mid] && target<= rotatedSortedArray[end]) {
                    beg = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = new int[] {4,7,8,10,1,2,3};
        int target = 1;
        int index = rotatedBinarySearch(sortedArray, target);
        System.out.println("Index : " + index);
    }
}
