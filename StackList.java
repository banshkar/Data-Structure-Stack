package Stack;
public class StackList<T>{
    public static void main(String[] args) {
        MyStack list =new MyStack();
        Node<Integer> myThirdNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> myFirstNode1 = new Node<>(560);
        list.add(myThirdNode);
        list.add(mySecondNode);
        list.add(myFirstNode);
        list.add(myFirstNode1);
        list.display();

    }
}
