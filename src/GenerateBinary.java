import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary
{
    public static void main(String[] args) {

        genarateBinary(100);
    }

    public static void genarateBinary(int n)
    {
        Queue<String> q=new LinkedList<>();

        q.offer("1");

        for(int i=0;i<n;i++)
        {
            String curr=q.poll();

            System.out.println(curr);

            q.offer(curr+"0");
            q.offer(curr+"1");
        }
    }
}
