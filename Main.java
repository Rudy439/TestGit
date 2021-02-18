package sk.kosickaakademia.matorudolf.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> fronta = new Queue<>(c:4);
        try {

            fronta.enqueue(value:15);
            fronta.enqueue(value:14);
            fronta.enqueue(value:30);

            // fronta
            fronta.enqueue(value:24);

            fronta.enqueue(value:31);
            fronta.enqueue(value:8888);

            // this is a comment
            fronta.print();
            fronta.print();
            fronta.dequeue();
            
            fronta.print();
        }

        public void hello(){
            // hello
        }

        public int hello(){
            return 5;
        }
        //koniec

    }
}
