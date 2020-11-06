package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import org.springframework.data.repository.CrudRepository;

public interface TodosService extends CrudRepository<Todos, Long>
{
    void markComplete(long todoid);
    Todos findTodosById(long id);
}
