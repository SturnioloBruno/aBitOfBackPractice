package dev.br1botcompany.content_calendar.repository;

import dev.br1botcompany.content_calendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
}
