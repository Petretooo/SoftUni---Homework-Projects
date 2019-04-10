package todoList.entity;

import javax.persistence.*;

@Entity
@Table(name="tasks")
public class Task {

    private Integer id;
    private String title;
    private String comments;

    public Task() {
    }

    public Task(String title, String comments) {
        this.title = title;
        this.comments = comments;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(nullable = false)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
