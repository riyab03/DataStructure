public class Queue<T> {
    int n=10;
    //type casting
    T[] ar1=(T[]) new Object[n];

    int front=-1;
    int rear=-1;

    public void enqueue(T a) {
        if(rear==(n-1)){
            System.out.println("Queue is already full");
            return;
        }
        ar1[++rear]=a;

        if(front==-1){
           front=0;
        }

    }

    public void dequeue(){
        if(front==rear){
            System.out.println("Queue is Empty");
            rear=-1;front=-1;
        }

        else {
            System.out.println("dequeue:"+ar1[front++]);
        }
    }


    public void current() {
        if(front==-1){
            System.out.println("cannot print");
        }else {
            System.out.println("current:" + ar1[front]);
        }
    }

}
