package edu.fscj.cen3024c.taskmanager.entities;

public class Task {
    private Integer id;
    private String title;
    private String description;
    private String status; // PENDING, IN_PROGRESS, COMPLETED
    private String dueDate; // YYYY-MM-DD

    public Task(String title, String description, String status, String dueDate){
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}


