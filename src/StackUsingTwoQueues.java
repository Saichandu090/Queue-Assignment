import java.util.*;

public class StackUsingTwoQueues
{
    public static void main(String[] args) {

        Queue<Integer> q1=new PriorityQueue<>();
        q1.offer(23);
        q1.offer(85);
        Queue<Integer> q2=new PriorityQueue<>();
        q2.offer(10);
        q2.offer(20);


        Stack<Integer> s=new Stack<>();
        s.addAll(q1);


        s.addAll(q1.size(),q2);
        System.out.println(s.getFirst());
        System.out.println(s.getLast());
        s.push(56);
        s.push(52);
        System.out.println(s);

    }
}
