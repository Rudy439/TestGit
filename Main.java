package sk.kosickaakademia.matorudolf.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> fronta = new Queue<>(c:4);
        try {
            fronta.enqueue(value:24);
            fronta.enqueue(value:31);

            fronta.print();
            fronta.dequeue();
            fronta.print();
        }
    }
}
