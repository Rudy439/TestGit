package sk.kosickaakademia.matorudolf.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> fronta = new Queue<>(c:4);
        try {
            fronta.enqueue(value:15);
            fronta.enqueue(value:14);
            fronta.enqueue(value:30);
            fronta.enqueue(value:31);

            // this is a comment
            fronta.print();
            fronta.dequeue();
            
            fronta.print();
        }
        public void hello(){
            // hello
        }
    }
}
