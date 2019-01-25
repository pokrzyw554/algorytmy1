package kolejki;

public class kolejkLista
{
    public static kolejkElem first;
    public static kolejkElem last;

    public static void add(int value)
    {
        kolejkElem elem = new kolejkElem(value, null);
        if(first == null)
        {
            first = last = elem;
        }
        else
        {
            last.setNext(elem);
            last = elem;
        }
    }
    public static int poll()
    {
        int value = first.getValue();

        if(first.getNext()==null)
        {
            first = last = null;
        }else
            first = first.getNext();
        return value;
    }
    public static boolean isEmpty()
    {
        return first==null;
    }
    public static int peek()
    {
        if(isEmpty())
            System.out.println("pusty");
        return first.getValue();
    }
    public static void print()
    {
        kolejkElem tmp = first;
        while(tmp !=null)
        {
            System.out.println(tmp.getValue()+" ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
}
