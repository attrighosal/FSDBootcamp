package Queue;

public class QueueSource {

    public static void main(String[] args) {

        System.out.println("================ Custom Queue =======================");
        Queue queue = new Queue();
        queue.display();
        queue.insert(1);
        queue.insert(2);
        queue.display();
        queue.delete();
        queue.display();
        queue.delete();
        queue.display();
        queue.delete();
        queue.display();

        System.out.println("================ Collection Framework Queue =======================");
        java.util.Queue<Integer> queue1 = new java.util.LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        System.out.println(queue1);
        queue1.poll();
        System.out.println(queue1);
        queue1.poll();
        System.out.println(queue1);
    }
}
