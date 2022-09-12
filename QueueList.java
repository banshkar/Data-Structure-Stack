package Stack;
public class QueueList {
    public static void main(String[] args) {
        MyQueue list =new MyQueue();
        Node<Integer> myFirstNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(56);
        list.add(myFirstNode);
        list.add(mySecondNode);
        list.add(myThirdNode);
        list.display();
    }
}
