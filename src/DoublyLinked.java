public class DoublyLinked<T> {
    Node<T> head=null;
    Node<T> tail = null;

    public void add(T a) {
        Node<T> a1 = new Node<>(a);
        if (head == null) {
            head = a1;
            tail=a1;
        }
        else{
            tail.next=a1;
            a1.prev=tail;
            tail=a1;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("Doubly Linked list is empty");
        }
        else{
            Node<T> current = head;
            while(current !=null){
                System.out.print(current.data+" ");
                current =current.next;
            }
            System.out.println();
        }
    }

    public void reverseDisplay(){
        if(tail==null){
            System.out.println("Doubly Linked list is empty");
        }
        else{
            Node<T> current = tail;
            while(current !=null){
                System.out.print(current.data+" ");
                current =current.prev;
            }
            System.out.println();
        }
    }


}
