package arrays;

import java.util.PriorityQueue;

public class KthMaximumElement {
    public static int kthMaxElement(int[] array, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int value : array){
            pq.add(value);

            if (pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 3;

        System.out.println(kthMaxElement(arr,k));
    }
}
