package ro.fasttrackit.curs11.colectii;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class TryCollections {
    public static void main(String[] args) {
        tryQueue();
        tryStack();
        tryDeque();

    }

    public static void tryDeque(){
        System.out.println("====Deque");
        Deque<String> names = new ArrayDeque<>();

        names.addFirst("Ana");
        names.addLast("Maria");
        names.addFirst("Marius");
        names.addLast("Darius");

        System.out.println(names);
        names.removeFirst();
        System.out.println(names);
    }

    public static void tryStack(){
        System.out.println("====STACK");
        Stack<String> names = new Stack<>();
        names.push("Ana");
        names.push("Maria");
        names.push("Marius");
        names.add("Darius");

//        System.out.println(names.pop());
//        System.out.println(names.pop());
//        System.out.println(names.pop());
//        System.out.println(names.pop());

        while (!names.empty()){
            System.out.println(names.pop());
        }
    }

    public static void tryQueue(){
        Queue<String> names = new ArrayBlockingQueue<>(10);

        names.add("Ana");
        names.add("Maria");
        names.add("Marius");
        names.add("Darius");

        String fromQueue = names.remove();
        System.out.println(fromQueue);
        System.out.println(names);
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());

    }
}
