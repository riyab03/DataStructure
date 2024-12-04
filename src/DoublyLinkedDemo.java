public class DoublyLinkedDemo {
    public static void main(String[] args) {
        DoublyLinked<Integer> d1=new DoublyLinked<>();
        d1.add(10);
        d1.add(20);
        d1.add(30);
        d1.add(40);
        d1.add(50);
        d1.add(60);
        d1.display();
        d1.reverseDisplay();
    }
}
