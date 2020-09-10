package concurrency.callables;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private final int id;

    public MyCallable(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return String.format("%s using thread %s", this, Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MyCallable{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
