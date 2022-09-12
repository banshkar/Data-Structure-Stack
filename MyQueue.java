package Stack;

public class MyQueue {
    public   INode head;
    public   INode tail;
    public  void add(INode myNode) {
        if (head == null) {
            head = myNode;
            tail = myNode;
        } else {
            INode temp = head;
            head = myNode;
            head.setNext(temp);
        }
    }
    public void display(){
        INode currentNode=head;
        if(head==null){
            System.out.println("My stack is Empty");
            return;
        }
        while (currentNode!=null){
            if(currentNode.getNext()!=null){
                System.out.print(currentNode.getData()+" -> ");
                currentNode =currentNode.getNext();
            }
            else {
                System.out.println(currentNode.getData());
                currentNode=currentNode.getNext();
            }
        }
    }
}
