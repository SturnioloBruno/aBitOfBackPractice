package dev.br1botcompany.content_calendar.config;


import dev.br1botcompany.content_calendar.model.Content;
import dev.br1botcompany.content_calendar.model.Status;
import dev.br1botcompany.content_calendar.model.Type;
import dev.br1botcompany.content_calendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Profile("!dev")
@Component
public class DataLoader implements CommandLineRunner {

    private final ContentRepository repository;

    public DataLoader(ContentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Content c = new Content(
                null,
                "Hello from a data loader",
                "My first blog post",
                Status.IDEA,
                Type.VIDEO,
                LocalDateTime.now(),
                null,
                ""
        );
        repository.save(c);
    }
}
