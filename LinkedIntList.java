package Exc_1;

public class LinkedIntList
{
    public ListNode front;

    public LinkedIntList()
    {
        this.front = null;
    }

    public void set(int index,int value)
    {
        if(index==0)
        {
            this.front = new ListNode(value,front.next);
        } else
        {
            ListNode current = nodeAt(index-1);
            current.next = new ListNode(value,current.next.next);
        }
    }

    public void add(int i)
    {
        if(this.front==null)
        {
            this.front = new ListNode(i);
        } else
        {
            ListNode current = this.front;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next = new ListNode(i);
        }
    }

    public void add(int index, int value)
    {
        if(index==0)
        {
            this.front = new ListNode(value);
        } else
        {
            ListNode current = nodeAt(index);
            current.next = new ListNode(value,current.next);
        }
    }

    public void addSorted(int value)
    {
        if(this.front == null || this.front.data>=value)
        {
            this.front = new ListNode(value,front);
        } else
        {
            ListNode current = this.front;
            while(current.next != null && current.next.data<=value)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }

    public int get(int index)
    {
        ListNode current = nodeAt(index);
        return current.data;
    }

    private ListNode nodeAt(int index)
    {
        ListNode current = front;
        for(int i = 0;i<index;i++)
        {
            current = current.next;
        }
        return current;
    }

    public void remove(int index)
    {
        if(index==0)
        {
            front = front.next;
        } else
        {
            ListNode current = nodeAt(index-1);
            current.next = current.next.next;
        }
    }

    @Override
    public String toString()
    {
        if(this.front==null)
        {
            return "[]";
        } else
        {
            ListNode current = this.front.next;
            String str = "[" + this.front.data;
            while (current != null)
            {
                str += ", " + current.data;
                current = current.next;
            }
            str += "]";
            return str;
        }
    }

}
