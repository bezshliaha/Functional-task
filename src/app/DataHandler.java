package app;

import java.util.List;
import java.util.function.Consumer;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    AtomicInteger count = new AtomicInteger(1);

    public void handleData(List<User> list, Consumer<User> consumer) {
        for (User user : list) {
            consumer.accept(user);
        }
    }

    public Consumer<User> getUser() {
        return user ->
                new Outputer().getOutput(count.getAndIncrement() +
                        ") Username: " + user.getName() +
                        ", phone: " + user.getPhone()
                );
    }
}
