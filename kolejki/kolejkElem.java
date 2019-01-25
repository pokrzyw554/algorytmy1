package kolejki;

public class kolejkElem
{
    private int value;
    public kolejkElem prev;
    private kolejkElem next;

    public kolejkElem(int value, kolejkElem next)
    {
        this.value = value;
        this.next = next;
    }

    public kolejkElem(int value)
    {
        this.value = value;
        this.next = null;
    }

    public int getValue()
    {
        return value;
    }

    public kolejkElem getPrev()
    {
        return prev;
    }

    public kolejkElem getNext()
    {
        return next;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void setPrev(kolejkElem prev)
    {
        this.prev = prev;
    }

    public void setNext(kolejkElem next)
    {
        this.next = next;
    }
}
