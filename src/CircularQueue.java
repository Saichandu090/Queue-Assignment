import java.util.LinkedList;
import java.util.Queue;

public class CircularQueue
{
    private Queue<Integer> queue;
    private int maxSize;

    public CircularQueue(int size)
    {
        this.queue = new LinkedList<>();
        this.maxSize = size;
    }

    public boolean enqueue(int value)
    {
        if (isFull())
        {
            System.out.println("Queue is full,Dequeuing the front element to make space.");
            dequeue();
        }
            return queue.offer(value);
        }

        public Integer dequeue()
        {
            if (isEmpty())
            {
                System.out.println("Queue is empty. Cannot dequeue.");
                return null;
            }
            return queue.poll();
        }

        public Integer front()
        {
            if (isEmpty())
            {
                System.out.println("Queue is empty.");
                return null;
            }
            return queue.peek();
        }

        public boolean isFull()
        {
            return queue.size() == maxSize;
        }


        public boolean isEmpty()
        {
            return queue.isEmpty();
        }

        public void displayQueue()
        {
            System.out.println("Queue elements: " + queue);
        }

        public static void main(String[] args)
        {
            CircularQueue circularQueue = new CircularQueue(3);

            circularQueue.enqueue(1);
            circularQueue.enqueue(2);
            circularQueue.enqueue(3);

            circularQueue.displayQueue();

            circularQueue.enqueue(4);
            circularQueue.displayQueue();

            circularQueue.dequeue();
            circularQueue.displayQueue();

            System.out.println("Front element: " + circularQueue.front());
        }
    }

