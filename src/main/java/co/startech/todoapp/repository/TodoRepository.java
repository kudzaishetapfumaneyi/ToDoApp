package co.startech.todoapp.repository;

import co.startech.todoapp.domain.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TodoRepository extends PagingAndSortingRepository <Todo, Long> {
}
