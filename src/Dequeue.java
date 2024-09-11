public class Dequeue<T>
{
    SinglyLinkedList<T> singly=new SinglyLinkedList<>();

    public void addFront(T data)
    {
        singly.addFirst(data);
    }

    public void addRear(T data)
    {
        singly.addLast(data);
    }

    public T removeFront()
    {
        return singly.deleteFirst();
    }

    public T removeRear()
    {
        return singly.deleteLast();
    }

    public T peek()
    {
        return singly.firstElement();
    }

    public boolean isEmpty()
    {
        return singly.isEmpty();
    }

    public int size()
    {
        return singly.size();
    }

    @Override
    public String toString()
    {
        return singly.toString();
    }
}
