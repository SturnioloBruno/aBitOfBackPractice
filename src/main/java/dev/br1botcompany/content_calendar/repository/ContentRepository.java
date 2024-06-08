package dev.br1botcompany.content_calendar.repository;

import dev.br1botcompany.content_calendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;


import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByContentType(String type);
}
