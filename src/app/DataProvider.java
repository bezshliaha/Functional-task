package app;

import java.util.Arrays;
import java.util.List;

public class DataProvider {
    public List<User> getData() {
        return Arrays.asList(
                new User("Anna", "+49 176 434 56"),
                new User("Eugen", "+49 178 456 78"),
                new User("Nikolay", "+49 176 556 70"),
                new User("Oksana", "+49 176 343 45"),
                new User("Nataly", "+49 176 987 16")
        );
    }
}

