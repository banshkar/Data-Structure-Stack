package Stack;
public class MyStack {
  public   INode head;
  public   INode tail;
    public  void add(INode myNode){
       if(head==null){
           head=myNode;
           tail=myNode;
       }
        else {
            tail.setNext(myNode);
           tail=myNode;
        }
    }  public void  peek(){
        INode temp =tail;
        head.setData(temp);
        System.out.println(temp.getData());
    }
    public void pop(){
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            INode currentNode = head;

            currentNode = currentNode.getNext();
            currentNode.setNext(null);
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
