package generics;

public class Tuple<TFirst, TSecond> {
    private TFirst first;
    private TSecond second;

    public Tuple(TFirst first, TSecond second) {
        this.first = first;
        this.second = second;
    }

    public TFirst getFirst() {
        return first;
    }

    public TSecond getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("Tuple{first=%s, second=%s}", first, second);
    }
}
