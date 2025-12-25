package com.riigsoft.todosapp.repo;

import com.riigsoft.todosapp.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // optional
public interface TodoRepo extends JpaRepository<Todo, Long> {
}
