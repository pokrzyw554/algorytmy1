public class tablicze
{
    public static void main(String[] args)
    {
        int[] tab = new int[11];
        tab[0] = 5;
        tab[1] = 3;
        tab[2] = 14;
        tab[3] = 2;
        tab[4] = 8;
        tab[5] = 12;        //dziala w przypadku tablicy 6 elementow
        tab[6] = 2;         //dodajmy elementy i zobaczmy znowu
        tab[7] = 1;
        tab[8] = 15;
        tab[9] = 7;
        tab[10] = 5;
        for(int i = tab.length-1; i>=0; i--)
        {
            if(i%2==0)
                System.out.println(tab[i]);
        }           //działa punkt a)
        System.out.println();

       int temp = 0;
       int result = 0;
        for(int i =0; i<tab.length;i++)
        {
            if(tab[i]%3==0)
                temp += tab[i];     //dziala

        }       //też działą
        System.out.println(temp);
        System.out.println();

        temp = 0;
        result = 0;
        for(int i = 0; i<5;i++)     //tutaj sie jebłeś
        {
            temp += tab[i];
        }
        result = temp - tab[tab.length-1];
        System.out.println(result);     //a to nie dziala, juz dziala
    }
}
