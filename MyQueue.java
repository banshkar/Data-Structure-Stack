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
    public void  peek(){
      INode temp =head;
      head=temp.getNext();
      head.setNext(temp);
      System.out.println(temp.getData());
    }
    public void pop(){
        if (head == null) {
            System.out.println("List is Empty");
        } else {
           head=head.getNext();
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
