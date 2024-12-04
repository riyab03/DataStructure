import java.util.Objects;

public class Stack<T>{

    //type casting
    T[] ar1=(T[]) new Object[10];;

    int top=-1;

    public void push(T a) {
        if((top)==(ar1.length-1)){
            System.out.println("Stack is full");
        }
        else ar1[++top]=a;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("pop:"+ar1[top]);
            --top;
        }
    }


    public void peek() {
        System.out.println("top:"+ar1[top]);
    }



}
