package todoList.bindingModel;

public class TaskBindingModel {

    private Integer id;
    private String title;
    private String comments;

    public TaskBindingModel(Integer id, String title, String comments) {
        this.id = id;
        this.title = title;
        this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
