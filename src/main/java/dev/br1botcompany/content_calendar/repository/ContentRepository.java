package dev.br1botcompany.content_calendar.repository;

import dev.br1botcompany.content_calendar.model.Content;
import dev.br1botcompany.content_calendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByContentType(String type);
}
