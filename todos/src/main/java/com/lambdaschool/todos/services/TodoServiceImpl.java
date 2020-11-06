package com.lambdaschool.todos.services;


import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodosRepository;
import com.lambdaschool.todos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todoService")
public class TodoServiceImpl implements TodosService{
    @Autowired
    private UserRepository userrepos;
    @Override
    public Todos findTodosById(long id) throws EntityNotFoundException{
        return todosrepos.findById(id).orElseThrow(()-> new EntityNotFoundException("Todos Id"+id+"Not Found"));
    }
}
