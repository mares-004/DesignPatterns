package Piterator;

public class NameRepository implements AggregateA {
    private String names[][] = {{"Rob", "Jon"},
            {"Jul", "Pas"},
            {"Pat", "Ken"}};

    @Override
    public IteratorA getIterator() {
        return new NameIterator(names);
    }

}