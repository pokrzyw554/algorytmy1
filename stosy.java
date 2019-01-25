import java.lang.reflect.Array;
import java.util.Scanner;

public class stosy
{
    static int[] stos = new int[10];
    static int stan = -1;
    public static void main(String[] args)
    {
    wywolajStos();

    }

    private static void wywolajStos()
    {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("podaj rozmiar stosu");
       /* int size = scanner.nextInt();*/

        while(true)
        {
            System.out.println("podaj operacje:"+'\n'
            +"1.push"+'\n'+
            "2.pop"+'\n'+
            "3. peek"+'\n'+
            "4. print"+'\n'+
            "0. wyjscie");
         int num = scanner.nextInt();
            switch(num)
            {
                case 1:
                    System.out.println("podaj wartość");
                    int value = scanner.nextInt();
                    try
                    {
                    push(value);
                    }catch(ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("podaj wartość");
                    //value = scanner.nextInt();
                    try
                    {
                        System.out.println(pop());
                    }catch(ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try
                    {
                        System.out.println(peek());
                    }catch (ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    printf();
                    break;
                case 0:
                    break;
            }
        }
    }

    static public void push(int cos) throws ArrayIndexOutOfBoundsException
    {
      if(stan==9)
      {
          System.out.println("stos jest pełny");
          throw new ArrayIndexOutOfBoundsException("is full");
      }
        stos[++stan] = cos;
    }
    static public int pop() throws ArrayIndexOutOfBoundsException
    {
       if(stan == -1)
       {
           System.out.println("stos jest pusty");
           throw new ArrayIndexOutOfBoundsException("pusty");
       }
       else
        return stos[stan--];
    }
    static public int peek() throws ArrayIndexOutOfBoundsException
    {
        if(stan==-1)
            throw new ArrayIndexOutOfBoundsException("pusta");
        else
        return stos[stan];
    }
    static void printf()
    {
        for(int i = 0; i < stan+1; i++)
        {
            System.out.print(stos[i] + " ");
        }
        System.out.println();
    }
}
