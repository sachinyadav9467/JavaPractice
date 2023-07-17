public class Node{
    public int data;
    public Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    void addNode(Node nextNode)
    {
        this.next=nextNode;
    }
}