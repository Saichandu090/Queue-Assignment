public class DequeueMain
{
    public static void main(String[] args) {

        Dequeue<Integer> d=new Dequeue<>();
        d.addFront(23);
        d.addFront(85);
        d.addFront(56);

        d.addRear(85);
        d.addRear(100);
        d.addFront(852);
        System.out.println(d);
    }
}
