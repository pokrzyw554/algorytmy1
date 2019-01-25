package Listy;

public class StosLista
{
    static public StosElem top;

     public StosLista(){
        top = null;
    }
    public static void push(int value)
    {
        StosElem newLast = new StosElem(value);
        newLast.setPrev(top);
        top=newLast;
        // top = new StosElem(value, top);
    }
    public static int pop() throws OutOfStoSException
    {
       if(isEmpty())
       {
           throw new OutOfStoSException("stos jest pusty ziom");
       }
        int temp = top.getValue();
       top = top.getPrev();
        return temp;
    }
    public static void peek()
    {
        System.out.println(top.getValue());
    }
    public static boolean isEmpty()
    {
        return top == null;
    }
    public static void print()
    {
        StosElem tmpElem = top;
        while(tmpElem !=null)
        {
            System.out.println(tmpElem.getValue() + " ");
            tmpElem = tmpElem.getPrev();
        }
    }
    public static void main(String[] args)
    {

    }
}
