package kolejki;

public class majn
{
    public static void main(String[] args)
    {

        kolejkLista.add(1);
        kolejkLista.add(2);
        kolejkLista.add(3);
        kolejkLista.add(4);
        kolejkLista.print();
        System.out.println(kolejkLista.poll());
        System.out.println();       //\n
        System.out.println(kolejkLista.peek());
        System.out.println();       //\n
        System.out.println(kolejkLista.poll());
        kolejkLista.print();



    }
}
