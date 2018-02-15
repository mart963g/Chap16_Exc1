package Exc_1;

public class Run
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(7);
        list.add(12);
        list.set(1,10);
        System.out.println(list);
    }
}
