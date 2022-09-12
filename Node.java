package Stack;
public class Node<T> implements INode<T>{
    T data;
    INode next;
  Node(){
  }
  public  Node(T data){
      this.data =data;
      this.next=null;
  }
    @Override
    public T getData() {
        return data;
    }
    @Override
    public void setData(T data) {
        this.data = data;
    }
    @Override
    public INode getNext() {
        return next;
    }
    public void setNext(INode next) {
        this.next = next;
    }
    public String toString(){
      return ""+data;
    }
}
