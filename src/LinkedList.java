
public class LinkedList <T>{
//    Node<T>[] a1=(Node<T>[])new Object();
//    T data;
    Node<T> head=null;
    Node<T> current=null;

    public void add(T a) {
        Node<T> a1 = new Node<>(a);
        if (head == null) {
            head = a1;
            current=head;
        }
        else{
            current.next=a1;
            current=a1;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            current=head;
            while(current !=null){
                System.out.println(current.data);
                current =current.next;
            }
        }
    }


}
