package com.springrest.springrest.entities;

public class Course {
    private  long id;
    private String title;
    private String descrption;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descrption='" + descrption + '\'' +
                '}';
    }

    public Course() {
        super();
    }

    public Course(long id, String title, String descrption) {
        super();
        this.id = id;
        this.title = title;
        this.descrption = descrption;
    }
}
