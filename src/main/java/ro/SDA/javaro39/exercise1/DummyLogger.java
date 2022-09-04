package ro.SDA.javaro39.exercise1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyLogger implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from task1");
    }
}
