package dev.skillsharbor.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
@Entity
@Table(name = "user_progress")

public class TrainLessons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "mod_id")
    private int modId;

    @Column(name = "lesson_type")
    private String lessonType;

    @Column(name = "lesson_content")
    private JSON lessonContent;

    @Column(name = "mod_order")
    private int modOrder;

    @Column(name = "created_by_id")
    private int createdById;

    @Column(name = "lesson_created_date")
    private long lessonCreatedDate;

    @Column(name = "lesson_updated_da")
    private long lessonUpdatedDate;

    public TrainLessons() {
    }

    public TrainLessons(int id, int modId, String lessonType, JSON lessonContent, int modOrder, int createdById, long lessonCreatedDate, long lessonUpdatedDate) {
        this.id = id,
        this.modId = modId;
        this.lessonType = lessonType;
        this.lessonContent = lessonContent;
        this.modOrder = modOrder;
        this.createdById = createdById;
        this.lessonCreatedDate = lessonCreatedDate;
        this.lessonUpdatedDate = lessonUpdatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModId() {
        return modId;
    }

    public void setModId(int modId) {
        this.modId = modId;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public JSON getLessonContent) {
        return lessonContent;
    }

    public void setLessonContent(JSON lessonContent) {
        this.lessonContent = lessonContent;
    }

    public int getModOrder() {
        return modOrder;
    }

    public void setModOrder(int modOrder) {
        this.modOrder = modOrder;
    }

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public long getLessonCreatedDate() {
        return lessonCreatedDate;
    }
    
    public void setLessonCreatedDate(long lessonCreatedDate) {
        this.lessonCreatedDate = lessonCreatedDate;
    }

    public long getLessonUpdatedDate() {
        return lessonUpdatedDate;
    }
            
    public void setLessonUpdatedDate(long lessonUpdatedDate) {
        this.lessonUpdatedDate = lessonUpdatedDate;            
    }

    @Override
    public String toString() {
        return "TrainLessons{" +
                "id=" + id +
                ", modId=" + modId +
                ", lessonType=" + lessonType +
                ", lessonContent=" + lessonContent +
                ", modOrder=" + modOrder +
                ", createdById=" + createdById +
                ", lessonCreatedDate=" + lessonCreatedDate +
                ", lessonUpdatedDate=" + lessonUpdatedDate +
                '}';
    }
}
