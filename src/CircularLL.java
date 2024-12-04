public class CircularLL<T> {
    Node<T>head=null;
    Node<T>current=null;
    public void add(T a){
        Node<T>a1=new Node<>(a);
        if(head==null){
            head=a1;
            current=a1;
            current.next=head;
        }
        else{
            current.next=a1;
            a1.next=head;
            current=a1;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("circular ll is empty");return;
        }
        else{
            current=head;
            while(current.next!=head){
                System.out.print(current.data+" ");
                current=current.next;
            }System.out.print(current.data+" ");
        }
    }



}
