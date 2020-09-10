package concurrency.blockingqueue;

public class Message {
    private int id;

    public Message(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Message{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
