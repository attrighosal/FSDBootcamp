package Searching;

public class BinarySearch {

    public static int binarySearch(int[] sortedArray, int target) {
        int beg=0, end=sortedArray.length-1;
        while (beg<=end) {
            int mid = (beg+end)/2;
            if (sortedArray[mid]==target) {
                return mid;
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
        int[] sortedArray = new int[] {1,3,4,6,8,10,12};
        int target = 9;
        int index = binarySearch(sortedArray, target);
        System.out.println("Index : " + index);
    }
}

/*
[0,31] (32)
[16,31] (16)
[24,31] (8)
[24,27] (4)
[24,25] (2)
[24,24] (1)

n/2^k = 1
k = logn
TC : O(logn)
SC : O(1)

[1,3,4,6,8,10,12], target = 6
TC : O(1)
beg=0, end=6, mid=(0+6)/2=3
arr[mid]==target

BC TC : O(1)
WC TC : O(logn)
SC : O(1)

[1,3,4,6,8,10,12], target = 10
beg=0, end=6 mid=3
beg=4, end=6, mid=5
TC : O(1) 2

AC = 1+2+3+....+(logn-1)+logn / logn
AC = logn*(logn+1)/2*logn = (logn+1)/2 = logn/2 = O(logn)

[1,3,4,2,7] target = 7
TC: O(n)
SC: O(1)

1. sort + binary search O(nlogn)
2. linear search O(n)

 */