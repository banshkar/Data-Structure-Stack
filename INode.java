package Stack;
public interface INode <T> {
    public  void setData(T data);
    public T getData();
    public  void setNext(INode<T> next);
    public   INode<T> getNext();
}
