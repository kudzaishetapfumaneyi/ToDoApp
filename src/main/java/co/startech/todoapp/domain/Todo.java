package co.startech.todoapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String todoItem;

    private String completed;

    public Todo() {

    }

    public Todo(String todoItem, String status) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(String todoItem) {
        this.todoItem = todoItem;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
