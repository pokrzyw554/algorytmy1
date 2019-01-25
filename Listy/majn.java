package Listy;


public class majn
{
    public static void main(String[] args)
    {
     StosLista.push(2);
     StosLista.push(3);
     StosLista.push(4);
     StosLista.push(5);
     StosLista.push(6);
     StosLista.print();
        try
        {
            System.out.println("pop:" + StosLista.pop());
        } catch(OutOfStoSException e)
        {
            e.getMessage();
        }
        try
        {
            System.out.println("pop:" + StosLista.pop());
        } catch(OutOfStoSException e)
        {
            e.getMessage();
        }
        StosLista.push(7);
     StosLista.push(8);

     StosLista.print();
     StosLista.peek();
        try
        {
            StosLista.pop();
        } catch(OutOfStoSException e)
        {
            e.getMessage();
        }
        StosLista.peek();

    }
}
