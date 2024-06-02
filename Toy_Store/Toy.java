package Toy_Store;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class Toy {
    private PriorityQueue<List<String>> toyQ;

    private String randFrequency() {
        Random random = new Random();
        return String.valueOf(random.nextInt(100));
    }

    public Toy(String id, String name, String n) {
        this.toyQ = new PriorityQueue<>();
        toyQ.add(Arrays.asList(id, n, name, randFrequency()));
    }

    public void putToy(String id, String name, String n) {
        toyQ.add(Arrays.asList(id, n, name, randFrequency()));
    }

    // TODO: Добавить обработку кол-ва.
    public String getToy() {
        Random rand = new Random();
        List<String> toy = toyQ.peek();
        if (toy.get(1).equals("0")) {
            toy = toyQ.peek();
        }

        return Integer.valueOf(toy.get(3)) >= rand.nextInt(100) ? toy.toString() : "Losser";
    }
    
}
