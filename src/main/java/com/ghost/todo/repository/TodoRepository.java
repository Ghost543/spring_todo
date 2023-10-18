package com.ghost.todo.repository;

import com.ghost.todo.model.Task;
import org.springframework.data.repository.ListCrudRepository;

public interface TodoRepository extends ListCrudRepository<Task, Integer> {

//    @Query("""
//        UPDATE Task
//        SET status = :status
//        WHERE id = :id
//    """)
//    void updateTaskStatusById(@Param("id") UUID id, @Param("status") Status status);

}
