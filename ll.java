public class ll{
    public Node head,tail;
    ll()
    {
        tail=null;
        head=null;
    }
    public  Node addNode(int data)
    {
        Node tempNode=new Node(data);
        if(head==null){
            head = tempNode;
            tail=head;
        }
        else {
            tail.addNode(tempNode);
            tail=tempNode;
        }
        return head;
    }
    public void print()
    {
        System.out.println("printing LinkList    ");
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
}