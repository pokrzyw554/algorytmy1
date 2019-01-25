package Listy;

public class ONP
{
    public ONP()
    {
    }

    public static void run(String[] tab)
    {
        int[] stos = new int[10];
        int stan = -1;
        for(String e : tab)
        {
            try
            {
                int value = Integer.parseInt(e);
                StosLista.push(value);
            } catch(NumberFormatException ex)
            {
                int value1 = 0;
                int value2 = 0;
                {
                    try
                    {
                        value2 = StosLista.pop();
                        value1 = StosLista.pop();
                    } catch(OutOfStoSException sztosListaOutof)
                    {
                        sztosListaOutof.getMessage();
                    }
                    int count = 0;
                    switch(e)
                    {
                        case "+":
                            count = value1 + value2;
                            break;
                        case "-":
                            count = value1 - value2;
                            break;
                        case "*":
                            count = value1 * value2;
                            break;
                        case "/":
                            count = value1 / value2;
                            break;
                    }
                }
            }
            try
            {
                int result = StosLista.pop();
                System.out.println("wynik " + result);
            } catch(OutOfStoSException be)
            {
                be.getMessage();
            }
        }
    }
}
