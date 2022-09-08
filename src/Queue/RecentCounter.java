package Queue;

public class RecentCounter {

    java.util.Queue<Integer> queue;

    public RecentCounter() {
        queue = new java.util.LinkedList<>();
    }

    public int ping(int t) {
        int lower = t-3000;
        while(!queue.isEmpty() && queue.peek()<lower) {
            queue.poll();
        }
        queue.add(t);
        return queue.size();
    }
}
/**
    x = 3
    [t-x, t]
    [12,15]
    [0,1]->1
    [0,2]->2
    [0,2]->3
    [0,3]->4
    [1,4]->5
    [3,6]->3
    [7,10]->1
    [9,12]->2
    [12,15]->2

    6->[3,6]
    7->[4,7]

*/

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */