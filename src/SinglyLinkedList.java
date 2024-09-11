public class SinglyLinkedList<T>
{
    class Node
    {
        T data;
        Node next;
        Node(T data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    public void addFirst(T data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        n.next=head;
        head=n;
    }

    public void addAt(T data,int index)
    {
        Node n=new Node(data);
        if(index==0)
        {
            addFirst(data);
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null&&index>0)
        {
            prev=temp;
            temp=temp.next;
            index--;
        }
        if(temp!=null)
        {
            n.next = prev.next;
            prev.next = n;
        }
        else
            System.out.println("Index not in range!!");
    }

    public void addLast(T data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        tail.next=n;
        tail=n;
    }

    public T deleteFirst()
    {
        if(head==null)
            return (T) "List is Empty!!";
        T data=head.data;
        head=head.next;
        return data;
    }

    public T deleteLast()
    {
        if(head==null)
            return (T) "List is Empty!!";
        Node temp=head;
        Node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        T data=tail.data;
        prev.next=null;
        tail=prev;
        return data;
    }

    public T deleteAt(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null&&index>0)
        {
            prev=temp;
            if (temp.next!=null)
                temp=temp.next;
            else
            {
                return (T) "Index out of Range";
            }
            index--;
        }
        T data=temp.data;
        if (prev != null)
            prev.next = temp.next;
        temp.next=null;
        return data;
    }

    public void display()
    {
        display(head);
    }

    public void display(Node start)
    {
        if (start==null)
            return;
        System.out.println(start.data);
        display(start.next);
    }

    public boolean contains(T data)
    {
        return contains(data,head);
    }

    public boolean contains(T data,Node start)
    {
        if(start==null)
            return false;
        if(start.data.equals(data))
            return true;
        return contains(data,start.next);
    }

    public void displayReverse()
    {
        displayReverse(head);
    }

    public void displayReverse(Node start)
    {
        if(start.next!=null)
            displayReverse(start.next);
        System.out.println(start.data);
    }

    public void reverse()
    {
        if(head==null)
        {
            System.out.println("List is Empty!!");
            return;
        }
        Node temp=head;
        Node curr=null;
        Node prev=null;
        while(temp!=null)
        {
            curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        head=prev;
    }

    public boolean isEmpty()
    {
        if(head==null)
            return true;
        return false;
    }

    public void clear()
    {
        head=null;
    }

    public T firstElement()
    {
        if(head==null)
            return null;
        return head.data;
    }

    public T lastElement()
    {
        if(tail==null)
            return null;
        return tail.data;
    }

    @Override
    public String toString()
    {
        String st="[";
        Node temp=head;
        while(temp!=null)
        {
            st=st+temp.data;
            if(temp.next!=null)
                st=st+"->";
            temp=temp.next;
        }
        return st+"]";
    }

    public int size()
    {
        return size(head);
    }
    public int size(Node temp)
    {
        if(temp==null)
            return 0;
        return 1+size(temp.next);
    }
}
